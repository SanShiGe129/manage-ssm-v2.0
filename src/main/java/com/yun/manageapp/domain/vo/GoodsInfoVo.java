package com.yun.manageapp.domain.vo;

import com.yun.manageapp.domain.entity.GoodsoutInfo;
import com.yun.manageapp.domain.entity.Stock;
import lombok.Data;

import java.util.Date;

@Data
public class GoodsInfoVo {

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

    private GoodsoutInfo goodsoutInfo;

    /**
     * 库存
     *
     */

}