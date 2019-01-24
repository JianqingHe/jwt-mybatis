package com.usoft.b2b.manage.mapper;

import com.usoft.b2b.manage.domain.ListenErp;

public interface ListenErpMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ListenErp record);

    int insertSelective(ListenErp record);

    ListenErp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ListenErp record);

    int updateByPrimaryKey(ListenErp record);
}