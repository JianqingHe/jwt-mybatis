package com.usoft.b2b.manage.domain;

import java.util.Date;

public class LogError {
    private Long logId;

    private Date logDate;

    private String logEnname;

    private Long logEnuu;

    private String logMsg;

    private String logUrl;

    private String logUuid;

    private String logDetail;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public String getLogEnname() {
        return logEnname;
    }

    public void setLogEnname(String logEnname) {
        this.logEnname = logEnname == null ? null : logEnname.trim();
    }

    public Long getLogEnuu() {
        return logEnuu;
    }

    public void setLogEnuu(Long logEnuu) {
        this.logEnuu = logEnuu;
    }

    public String getLogMsg() {
        return logMsg;
    }

    public void setLogMsg(String logMsg) {
        this.logMsg = logMsg == null ? null : logMsg.trim();
    }

    public String getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl == null ? null : logUrl.trim();
    }

    public String getLogUuid() {
        return logUuid;
    }

    public void setLogUuid(String logUuid) {
        this.logUuid = logUuid == null ? null : logUuid.trim();
    }

    public String getLogDetail() {
        return logDetail;
    }

    public void setLogDetail(String logDetail) {
        this.logDetail = logDetail == null ? null : logDetail.trim();
    }
}