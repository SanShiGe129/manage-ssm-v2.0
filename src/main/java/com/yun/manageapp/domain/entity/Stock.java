package com.yun.manageapp.domain.entity;

import lombok.Data;

@Data
public class Stock {
    /**
    * 库存的主键
    */
    private Long stockId;

    private Long goodsId;

    /**
    * 库存的数量
    */
    private Integer stockValue;
}