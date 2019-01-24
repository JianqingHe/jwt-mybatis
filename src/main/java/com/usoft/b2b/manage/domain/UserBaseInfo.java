package com.usoft.b2b.manage.domain;

/**
 * 用户基本信息
 *
 * @author hejq
 * @date 2018-12-25 18:11
 */
public class UserBaseInfo {

    private String email;

    private String fullName;

    private String name;

    private String tel;

    public UserBaseInfo() {}

    public UserBaseInfo(Users user) {
        this.email = user.getEmail();
        this.fullName = user.getFullName();
        this.tel = user.getTel();
        this.name = user.getName();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "UserBaseInfo{" +
                "email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
