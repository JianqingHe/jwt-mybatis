package com.usoft.b2b.manage.service;

import com.usoft.b2b.manage.account.AccountToken;
import com.usoft.b2b.manage.bean.ResultMap;
import com.usoft.b2b.manage.bean.ResultPage;
import com.usoft.b2b.manage.domain.SecUsers;
import com.usoft.b2b.manage.domain.Users;

/**
 * @author hejq
 * @date 2018-12-17 11:52
 */
public interface UserService {

    SecUsers selectByPrimaryKey(Long uu);

    /**
     * 通过用户账号查询用户信息
     *
     * @param userName 用户账号（手机或邮箱）
     * @return 查询的用户信息
     */
    Users findByUserName(String userName);

    /**
     * 登录验证
     *
     * @param userName 账号
     * @param password 密码
     * @param ip ip地址
     * @return 验证结果
     */
    ResultMap login(String userName, String password, String ip);

    /**
     * 分页查询用户信息
     *
     * @param pageNumber 页码
     * @param pageSize 大小
     * @param keyword 搜索词
     * @return 查询结果
     */
    ResultPage<Users> selectByPage(long pageNumber, long pageSize, String keyword);

    /**
     * 根据user信息生成Token
     *
     * @param user 用户信息
     * @return AccountToken
     */
    AccountToken createToken(Users user);

    /**
     * 查询refreshToken是否已过期
     *
     * @param userName 用户账号
     * @return 刷新token
     */
    String getRefreshToken(String userName);

    /**
     * 根据用户信息刷新token
     *
     * @param userName 用户账号
     * @return token
     */
    ResultMap refreshToken(String userName);
}
