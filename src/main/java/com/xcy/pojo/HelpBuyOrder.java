package com.xcy.pojo;

import io.swagger.annotations.ApiModelProperty;

public class HelpBuyOrder {
    @ApiModelProperty(value ="id")
    private  int id;
    @ApiModelProperty(value ="帮我购买")
    private  String description;
    @ApiModelProperty(value ="账户的ID")
    private int accountId;
    @ApiModelProperty(value ="总订单ID")
    private int oid;
    @ApiModelProperty(value ="购买地址")
    private  String buyAddress;
    @ApiModelProperty(value ="收获地址")
    private  String getAddress;
    @ApiModelProperty(value ="购买时间")
    private  String buyTime;
    @ApiModelProperty(value ="选择的优惠卷种类")
    private  int tickId;
    @ApiModelProperty(value ="商品价格")
    private  int money;
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

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
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

    public String getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime;
    }

    public int getTickId() {
        return tickId;
    }

    public void setTickId(int tickId) {
        this.tickId = tickId;
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

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Order getOrder(){
        Order order = new Order();
        order.setKind(1);
        order.setDescription(this.description);
        order.setMoney(this.money);
        order.setStatus(1);
        order.setTime(this.getOtime());
        order.setAid(this.getAccountId());
        return order;
    }
}
