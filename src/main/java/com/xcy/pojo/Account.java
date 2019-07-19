package com.xcy.pojo;

import io.swagger.annotations.ApiModelProperty;

public class Account {

    @ApiModelProperty(value ="id")
    private int id;

    @ApiModelProperty(value ="用户余额")
    private int money;
    @ApiModelProperty(value ="用户Id")
    private int userId;

    @ApiModelProperty(value ="用户手机号")
    private String ticketId;
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


}
