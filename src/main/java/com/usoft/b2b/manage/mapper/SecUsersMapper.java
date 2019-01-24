package com.usoft.b2b.manage.mapper;

import com.usoft.b2b.manage.domain.SecUsers;
import org.springframework.stereotype.Repository;

@Repository
public interface SecUsersMapper {
    int deleteByPrimaryKey(Long userUu);

    int insert(SecUsers record);

    int insertSelective(SecUsers record);

    SecUsers selectByPrimaryKey(Long userUu);

    int updateByPrimaryKeySelective(SecUsers record);

    int updateByPrimaryKey(SecUsers record);
}