package com.xcy.pojo;

import io.swagger.annotations.ApiModelProperty;

public class User {
    @ApiModelProperty(value ="用户手机号")
    private int phoneNum;
    @ApiModelProperty(value ="验证码")
    private int code;
    @ApiModelProperty(value ="用户密码")
    private int password;




}
