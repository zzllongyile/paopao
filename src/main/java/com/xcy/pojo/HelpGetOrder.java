package com.xcy.pojo;

import io.swagger.annotations.ApiModelProperty;

public class HelpGetOrder {
    @ApiModelProperty(value = "id")
    private int id;
    @ApiModelProperty(value = "物品规格")
    private String description;
    @ApiModelProperty(value = "账户的ID")
    private int accountId;
    @ApiModelProperty(value = "总订单ID")
    private int oid;
    @ApiModelProperty(value = "取货地址")
    private String buyAddress;
    @ApiModelProperty(value = "收获地址")
    private String getAddress;
    @ApiModelProperty(value = "取货时间")
    private String putTime;
    @ApiModelProperty(value = "送到时间")
    private String upTime;
    @ApiModelProperty(value = "配送费用")
    private int money;
    @ApiModelProperty(value = "两地之间的长度")
    private int distance;
    @ApiModelProperty(value = "订单生成时间")
    private String otime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getBuyAddress() {
        return buyAddress;
    }

    public void setBuyAddress(String buyAddress) {
        this.buyAddress = buyAddress;
    }

    public String getGetAddress() {
        return getAddress;
    }

    public void setGetAddress(String getAddress) {
        this.getAddress = getAddress;
    }

    public String getPutTime() {
        return putTime;
    }

    public void setPutTime(String putTime) {
        this.putTime = putTime;
    }

    public String getUpTime() {
        return upTime;
    }

    public void setUpTime(String upTime) {
        this.upTime = upTime;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getOtime() {
        return otime;
    }

    public void setOtime(String otime) {
        this.otime = otime;
    }

    public HelpGetOrder(int id, String description, int accountId, int oid, String buyAddress, String getAddress, String putTime, String upTime, int money, int distance, String otime) {
        this.id = id;
        this.description = description;
        this.accountId = accountId;
        this.oid = oid;
        this.buyAddress = buyAddress;
        this.getAddress = getAddress;
        this.putTime = putTime;
        this.upTime = upTime;
        this.money = money;
        this.distance = distance;
        this.otime = otime;
    }

    @Override
    public String toString() {
        return "HelpGetOrder{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", accountId=" + accountId +
                ", oid=" + oid +
                ", buyAddress='" + buyAddress + '\'' +
                ", getAddress='" + getAddress + '\'' +
                ", putTime='" + putTime + '\'' +
                ", upTime='" + upTime + '\'' +
                ", money=" + money +
                ", distance=" + distance +
                ", otime='" + otime + '\'' +
                '}';
    }
}
