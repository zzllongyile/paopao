package com.xcy.pojo;

import io.swagger.annotations.ApiModelProperty;

public class HelpLineOrder {
    @ApiModelProperty(value = "id")
    private int id;
    @ApiModelProperty(value = "排队叙述")
    private String description;
    @ApiModelProperty(value = "账户的ID")
    private int accountId;
    @ApiModelProperty(value = "总订单ID")
    private int oid;
    @ApiModelProperty(value = "排队地址")
    private String address;
    @ApiModelProperty(value = "排队目的")
    private String aim;
    @ApiModelProperty(value = "排队时长")
    private String time;
    @ApiModelProperty(value = "排队费用")
    private int money;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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
    public Order getOrder() {
        Order order = new Order();
        order.setKind(4);
        order.setDescription(this.description);
        order.setMoney(this.money);
        order.setStatus(1);
        order.setTime(this.getOtime());
        order.setAid(this.getAccountId());
        return order;
    }
}
