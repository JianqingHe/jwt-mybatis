package com.usoft.b2b.manage.mapper;

import com.usoft.b2b.manage.domain.PurcNoticeRecord;

public interface PurcNoticeRecordMapper {
    int deleteByPrimaryKey(Long noId);

    int insert(PurcNoticeRecord record);

    int insertSelective(PurcNoticeRecord record);

    PurcNoticeRecord selectByPrimaryKey(Long noId);

    int updateByPrimaryKeySelective(PurcNoticeRecord record);

    int updateByPrimaryKey(PurcNoticeRecord record);
}