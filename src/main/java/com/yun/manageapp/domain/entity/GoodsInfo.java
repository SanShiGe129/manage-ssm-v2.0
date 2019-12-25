package com.yun.manageapp.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class GoodsInfo {
    /**
    * 物品id
    */
    private Long goodsId;

    /**
    * category的外键
    */
    private Long categoryId;

    /**
    * 物品名称
    */
    private String goodsName;

    /**
    * 物品序列号
    */
    private String goodsNumber;

    /**
    * 创建时间
    */
    private Date creatTime;

    /**
    * 修改时间
    */
    private Date updateTime;

    /**
    * 是否删除? 0不删除 1删除 默认0
    */
    private Boolean isDelete;
}