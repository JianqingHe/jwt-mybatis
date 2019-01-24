package com.usoft.b2b.manage.domain;

import java.util.Date;

public class PurcNoticeRecord {
    private Long noId;

    private Date noDate;

    private String noDescribe;

    private String noEnname;

    private Long noEnuu;

    private String noKind;

    private Integer noErrcount;

    public Long getNoId() {
        return noId;
    }

    public void setNoId(Long noId) {
        this.noId = noId;
    }

    public Date getNoDate() {
        return noDate;
    }

    public void setNoDate(Date noDate) {
        this.noDate = noDate;
    }

    public String getNoDescribe() {
        return noDescribe;
    }

    public void setNoDescribe(String noDescribe) {
        this.noDescribe = noDescribe == null ? null : noDescribe.trim();
    }

    public String getNoEnname() {
        return noEnname;
    }

    public void setNoEnname(String noEnname) {
        this.noEnname = noEnname == null ? null : noEnname.trim();
    }

    public Long getNoEnuu() {
        return noEnuu;
    }

    public void setNoEnuu(Long noEnuu) {
        this.noEnuu = noEnuu;
    }

    public String getNoKind() {
        return noKind;
    }

    public void setNoKind(String noKind) {
        this.noKind = noKind == null ? null : noKind.trim();
    }

    public Integer getNoErrcount() {
        return noErrcount;
    }

    public void setNoErrcount(Integer noErrcount) {
        this.noErrcount = noErrcount;
    }
}