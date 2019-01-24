package com.usoft.b2b.manage.service.impl;

import com.alibaba.fastjson.JSON;
import com.usoft.b2b.manage.account.AccountToken;
import com.usoft.b2b.manage.bean.ResultCode;
import com.usoft.b2b.manage.bean.ResultMap;
import com.usoft.b2b.manage.bean.ResultPage;
import com.usoft.b2b.manage.domain.SecUsers;
import com.usoft.b2b.manage.domain.Users;
import com.usoft.b2b.manage.exception.MyException;
import com.usoft.b2b.manage.exception.UnAuthorizedException;
import com.usoft.b2b.manage.mapper.SecUsersMapper;
import com.usoft.b2b.manage.mapper.UsersMapper;
import com.usoft.b2b.manage.service.UserService;
import com.usoft.b2b.manage.utils.JwtUtil;
import com.usoft.b2b.manage.utils.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author hejq
 * @date 2018-12-17 11:52
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SecUsersMapper usersMapper;

    @Autowired
    private UsersMapper userMapper;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public SecUsers selectByPrimaryKey(Long uu) {
        return usersMapper.selectByPrimaryKey(uu);
    }

    @Override
    public Users findByUserName(String userName) {
        List<Users> users = userMapper.selectByTel(userName);
        if (CollectionUtils.isEmpty(users)) {
            users = userMapper.selectByMail(userName);
            if (CollectionUtils.isEmpty(users)) {
                throw new MyException(HttpStatus.NOT_FOUND.toString(), "User didn't existed!");
            }
        }
        return users.get(0);
    }

    /**
     * 登录验证
     *
     * @param userName 账号
     * @param password 密码
     * @param ip ip地址
     * @return 验证结果
     */
    @Override
    public ResultMap login(String userName, String password, String ip) {
        Users user = findByUserName(userName);
        if (Md5Utils.encode(password, user.getName()).equals(user.getPassword())) {
            AccountToken accountToken = createToken(user);
            return new ResultMap<>(ResultCode.OK.code(), "Login success", accountToken);
        }
        throw new UnAuthorizedException("Login failed");
    }

    /**
     * 根据user信息生成Token
     *
     * @param user 用户信息
     * @return AccountToken
     */
    @Override
    public AccountToken createToken(Users user) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        Object accessObject = valueOperations.get(user.getTel() + AccountToken.EXPIRE_KEY);
        String accessToken;
        if (null != accessObject) {
            accessToken = accessObject.toString();
        } else {
            accessToken = JwtUtil.sign(user.getTel(), user.getPassword(), AccountToken.EXPIRE_TIME);
            valueOperations.set(user.getTel() + AccountToken.EXPIRE_KEY, accessToken, AccountToken.EXPIRE_TIME, TimeUnit.MILLISECONDS);
        }
        String refreshToken = getRefreshToken(user.getTel());
        if (null == refreshToken) {
            refreshToken = JwtUtil.sign(user.getTel(), user.getPassword(), AccountToken.REFRESH_EXPIRE_TIME);
            valueOperations.set(user.getTel() + AccountToken.REFRESH_EXPIRE_KEY, accessToken, AccountToken.REFRESH_EXPIRE_TIME, TimeUnit.MILLISECONDS);
        }
        return new AccountToken(accessToken, refreshToken);
    }

    /**
     * 查询refreshToken是否已过期
     *
     * @param userName 用户姓名
     * @return 刷新token
     */
    @Override
    public String getRefreshToken(String userName) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        Object object = valueOperations.get(userName + AccountToken.REFRESH_EXPIRE_KEY);
        if (null != object) {
            return object.toString();
        }
        return null;
    }

    /**
     * 根据用户信息刷新token
     *
     * @param userName 用户账号
     * @return token
     */
    @Override
    public ResultMap refreshToken(String userName) {
        Users user = findByUserName(userName);
        String refreshToken = getRefreshToken(userName);
        if (null == refreshToken) {
            return ResultMap.error(new MyException(HttpStatus.UNAUTHORIZED.toString(), "token已过期"));
        }
        return ResultMap.success(createToken(user));
    }

    /**
     * 检验是否已登录
     *
     * @param user 用户
     * @param ip 访问ip
     */
    private AccountToken enableLogin(Users user, String ip) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        String value = valueOperations.get(user.getTel() + AccountToken.EXPIRE_KEY);
        if (null != value) {
            return JSON.parseObject(value, AccountToken.class);
        }
        return null;
    }

    /**
     * 分页查询用户信息
     *
     * @param pageNumber 页码
     * @param pageSize   大小
     * @return 查询结果
     */
    @Override
    public ResultPage<Users> selectByPage(long pageNumber, long pageSize, String keyword) {
        ResultPage<Users> page = new ResultPage<>(pageNumber, pageSize);
        Map<String, Object> condition = new HashMap<>(1);
        if (!StringUtils.isEmpty(keyword)) {
            condition.put("keyword", keyword);
        }
        return page.addContent(page, userMapper.selectByPage(page, condition));
    }
}
