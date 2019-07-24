package com.xcy.pojo;


//代收货款账户
public class CollectionAccount {

    //用户id
    private int id;
    //代收款账户
    private int phoneNum;

    private String userName;


    public CollectionAccount() {
    }

    @Override
    public String toString() {
        return "CollectionAccount{" +
                "id=" + id +
                ", phoneNum=" + phoneNum +
                ", userName='" + userName + '\'' +
                '}';
    }

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CollectionAccount(int id, int phoneNum, String userName) {
        this.id = id;
        this.phoneNum = phoneNum;
        this.userName = userName;
    }
}
