package com.yun.manageapp.domain.entity;

import lombok.Data;

@Data
public class Category {
    /**
    * 主键id
    */
    private Long categoryId;

    /**
    * 一级分类名
    */
    private String categoryName;
}