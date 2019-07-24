package com.xcy.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("帮帮忙")
public class HelpOrder {
    @ApiModelProperty(value ="id")
    private int id;
    @ApiModelProperty(value ="总订单ID")
    private int oid;
    @ApiModelProperty(value ="账户的ID")
    private int accountId;
    @ApiModelProperty(value ="帮忙事件简介")
    private String description;
    @ApiModelProperty(value ="帮忙时间")
    private  String time;
    @ApiModelProperty(value ="帮忙位置")
    private String size;
    @ApiModelProperty(value ="帮忙需求")
    private String requirement;
    @ApiModelProperty(value ="帮忙价格")
    private int money;
    @ApiModelProperty(value ="订单生成时间")
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
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

    public String getOtime() {
        return otime;
    }

    public void setOtime(String otime) {
        this.otime = otime;
    }

    public Order getOrder(){
        Order order = new Order();
        order.setKind(5);
        order.setDescription(this.description);
        order.setMoney(this.money);
        order.setStatus(1);
        order.setTime(this.getOtime());
        order.setAid(this.getAccountId());
        return order;
    }
}
