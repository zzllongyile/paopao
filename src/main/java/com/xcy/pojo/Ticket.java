package com.xcy.pojo;

public class Ticket {

    private int id;


    private String endTime;

    private String address;

    //折扣
    private int discount;


    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", endTime='" + endTime + '\'' +
                ", address='" + address + '\'' +
                ", discount=" + discount +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Ticket() {
    }

    public Ticket(int id, String endTime, String address, int discount) {
        this.id = id;
        this.endTime = endTime;
        this.address = address;
        this.discount = discount;
    }
}
