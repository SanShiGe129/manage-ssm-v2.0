package com.yun.manageapp.domain.vo;

import com.yun.manageapp.domain.entity.GoodsInfo;
import lombok.Data;

import java.util.List;

@Data
public class CategoryVo {
    /**
    * 主键id
    */
    private Long categoryId;

    /**
    * 一级分类名
    */
    private String categoryName;

    /**
     *
     * 货物信息
     *
     */
    private List<GoodsInfo> goodsInfoVo;
}