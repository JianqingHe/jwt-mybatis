package com.usoft.b2b.manage.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.usoft.b2b.manage.bean.ResultPage;
import com.usoft.b2b.manage.domain.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 用户信息查询
 *
 * @author US50
 */
@Repository
public interface UsersMapper extends BaseMapper<Users> {
    int deleteByPrimaryKey(Long id);

    @Override
    Integer insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    /**
     * 通过电话号码查询用户信息
     *
     * @param tel 电话号码
     * @return 用户
     */
    List<Users> selectByTel(String tel);

    /**
     * 通过邮箱查询用户信息
     *
     * @param email 邮箱
     * @return 用户
     */
    List<Users> selectByMail(String email);

    /**
     * 通过关键字搜索用户信息
     *
     * @param page 分页信息
     * @param condition 查询条件
     * @return 查询结果
     */
    List<Users> selectByPage(@Param("page") IPage<Users> page, @Param("condition") Map<String, Object> condition);
}