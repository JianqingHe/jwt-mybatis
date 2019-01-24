package com.usoft.b2b.manage.mapper;

import com.usoft.b2b.manage.domain.LogError;

public interface LogErrorMapper {
    int deleteByPrimaryKey(Long logId);

    int insert(LogError record);

    int insertSelective(LogError record);

    LogError selectByPrimaryKey(Long logId);

    int updateByPrimaryKeySelective(LogError record);

    int updateByPrimaryKeyWithBLOBs(LogError record);

    int updateByPrimaryKey(LogError record);
}