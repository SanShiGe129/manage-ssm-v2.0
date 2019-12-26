package com.yun.manageapp.mapper;

import com.yun.manageapp.domain.entity.Category;
import com.yun.manageapp.domain.vo.CategoryVo;

import java.util.List;

public interface CategoryMapper {

    /**
     * 功能是在页面展示所有信息
     *
     * @return CategoryVo
     */
    List<CategoryVo> findAllGoodsInfo();
}