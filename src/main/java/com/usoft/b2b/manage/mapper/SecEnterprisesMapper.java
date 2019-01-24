package com.usoft.b2b.manage.mapper;

import com.usoft.b2b.manage.domain.SecEnterprises;

public interface SecEnterprisesMapper {
    int deleteByPrimaryKey(Long enUu);

    int insert(SecEnterprises record);

    int insertSelective(SecEnterprises record);

    SecEnterprises selectByPrimaryKey(Long enUu);

    int updateByPrimaryKeySelective(SecEnterprises record);

    int updateByPrimaryKey(SecEnterprises record);
}