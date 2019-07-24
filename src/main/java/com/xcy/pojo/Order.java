package com.xcy.pojo;

import io.swagger.annotations.ApiModelProperty;

public class Order {

    @ApiModelProperty(value ="id")
    private int id;
    @ApiModelProperty(value ="用户id")
    private int aid;
    @ApiModelProperty(value ="订单的种类 1 2 3 4 5表示，1:帮我买2：帮我送3：帮我取4：帮排队5：帮帮忙")
    private int kind;
    @ApiModelProperty(value ="订单描述截取")
    private String description;
    @ApiModelProperty(value ="订单金额")
    private int money;
    @ApiModelProperty(value ="订单状态，1：代支付2：待接单3：进行中4：待收货")
    private int status;
    @ApiModelProperty(value ="订单生成时间")
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
