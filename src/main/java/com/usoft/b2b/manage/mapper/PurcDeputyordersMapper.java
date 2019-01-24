package com.usoft.b2b.manage.mapper;

import com.usoft.b2b.manage.domain.PurcDeputyorders;

public interface PurcDeputyordersMapper {
    int deleteByPrimaryKey(Long deoId);

    int insert(PurcDeputyorders record);

    int insertSelective(PurcDeputyorders record);

    PurcDeputyorders selectByPrimaryKey(Long deoId);

    int updateByPrimaryKeySelective(PurcDeputyorders record);

    int updateByPrimaryKey(PurcDeputyorders record);
}