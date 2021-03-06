package com.xcy.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;


@ApiModel("账户信息")
public class Account implements Serializable {

    @ApiModelProperty(value ="id",required=true)
    private int id;

    @ApiModelProperty(value ="用户余额")
    private int money;
    @ApiModelProperty(value ="用户Id")
    private int userId;

    @ApiModelProperty(value ="用户手机号")
    private String phoneNum;
    @ApiModelProperty(value ="用户头像")
    private String headImg;
    @ApiModelProperty(value ="用户生日")
    private String birthday;
    @ApiModelProperty(value ="昵称")
    private String nickName;
    @ApiModelProperty(value ="注册地")
    private String registerAddress;
    @ApiModelProperty(value ="用户等级")
    private String accountLevel;

    public Account(int id, int money, int userId, String phoneNum, String headImg, String birthday, String nickName, String registerAddress, String accountLevel) {
        this.id = id;
        this.money = money;
        this.userId = userId;
        this.phoneNum = phoneNum;
        this.headImg = headImg;
        this.birthday = birthday;
        this.nickName = nickName;
        this.registerAddress = registerAddress;
        this.accountLevel = accountLevel;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                ", userId=" + userId +
                ", phoneNum='" + phoneNum + '\'' +
                ", headImg='" + headImg + '\'' +
                ", birthday='" + birthday + '\'' +
                ", nickName='" + nickName + '\'' +
                ", registerAddress='" + registerAddress + '\'' +
                ", accountLevel='" + accountLevel + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(String accountLevel) {
        this.accountLevel = accountLevel;
    }

    public Account() {
    }
}
