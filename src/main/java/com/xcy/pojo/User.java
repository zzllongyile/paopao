package com.xcy.pojo;

import io.swagger.annotations.ApiModelProperty;

public class User {

    private int id;
    @ApiModelProperty(value ="用户手机号")
    private int phoneNum;
    @ApiModelProperty(value ="验证码")
    private int code;
    @ApiModelProperty(value ="用户密码")
    private int password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "phoneNum=" + phoneNum +
                ", code=" + code +
                ", password=" + password +
                '}';
    }
}
