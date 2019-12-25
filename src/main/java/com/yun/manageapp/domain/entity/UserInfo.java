package com.yun.manageapp.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class UserInfo {
    /**
    * 用户id
    */
    private Long userId;

    /**
    * 用户名
    */
    private String userName;

    /**
    * 用户电话
    */
    private String phone;

    /**
    * 部门
    */
    private String department;

    /**
    * 创建时间
    */
    private Date createTime;
}