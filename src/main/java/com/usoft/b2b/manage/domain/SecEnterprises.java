package com.usoft.b2b.manage.domain;

import java.util.Date;

public class SecEnterprises {
    private Long enUu;

    private String enAddress;

    private Long enAdminuu;

    private String enBusinesscode;

    private Date enTime;

    private String enName;

    private String enType;

    public Long getEnUu() {
        return enUu;
    }

    public void setEnUu(Long enUu) {
        this.enUu = enUu;
    }

    public String getEnAddress() {
        return enAddress;
    }

    public void setEnAddress(String enAddress) {
        this.enAddress = enAddress == null ? null : enAddress.trim();
    }

    public Long getEnAdminuu() {
        return enAdminuu;
    }

    public void setEnAdminuu(Long enAdminuu) {
        this.enAdminuu = enAdminuu;
    }

    public String getEnBusinesscode() {
        return enBusinesscode;
    }

    public void setEnBusinesscode(String enBusinesscode) {
        this.enBusinesscode = enBusinesscode == null ? null : enBusinesscode.trim();
    }

    public Date getEnTime() {
        return enTime;
    }

    public void setEnTime(Date enTime) {
        this.enTime = enTime;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getEnType() {
        return enType;
    }

    public void setEnType(String enType) {
        this.enType = enType == null ? null : enType.trim();
    }
}