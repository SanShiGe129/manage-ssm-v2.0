package com.yun.manageapp.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class ManageInfo {
    /**
    * 管理员表
    */
    private Long manageId;

    /**
    * 管理员姓名
    */
    private String manageName;

    /**
    * 管理员电话
    */
    private String managePhone;

    /**
    * 是否使用? 0 不使用 1使用 默认1
    */
    private Boolean isUse;

    /**
    * 是否删除? 0 删除 1不删除 默认1
    */
    private Boolean isDelete;

    /**
    * 是否为超级管理员?0不是 1是 默认0
    */
    private Boolean isSuper;

    /**
    * 创建时间
    */
    private Date creatTime;
}