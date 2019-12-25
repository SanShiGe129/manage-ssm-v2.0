package com.yun.manageapp.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class GoodsoutInfo {
    /**
    * 出库物品的主键
    */
    private Long goodsoutId;

    /**
    * user_info的外键
    */
    private Long userId;

    /**
    * goods_info的外键
    */
    private Long goodsId;

    /**
    * 出库数量
    */
    private Integer outCnt;

    /**
    * 创建时间
    */
    private Date creatTime;

    /**
    * 更新时间
    */
    private Date updataTime;

    /**
    * 是否使用 0没使用 1使用 默认0
    */
    private Boolean isUse;

    /**
    * 是否入库?  0没有入库 1已入库 默认0
    */
    private Boolean isIn;

    /**
    * 是否删除? 0不删除 1删除 默认0
    */
    private Boolean isDelete;

    /**
    * 是否审核? 0没审核 1已审核 默认0
    */
    private Boolean isVerify;

    /**
    * 入库的图片路径
    */
    private String inImg;

    /**
    * 出库的图片路径
    */
    private String outImg;

    /**
    * 留言
    */
    private String feedback;
}