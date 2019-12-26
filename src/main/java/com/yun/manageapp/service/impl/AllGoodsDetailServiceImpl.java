package com.yun.manageapp.service.impl;

import com.yun.manageapp.domain.vo.CategoryVo;
import com.yun.manageapp.mapper.CategoryMapper;
import com.yun.manageapp.service.AllGoodsDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName AllGoodsDetailServiceImpl
 * @Author lulei
 * @Data 2019/12/27 0:03
 */

@Service
public class AllGoodsDetailServiceImpl implements AllGoodsDetailService {

    @Resource
    private CategoryMapper categoryMapper;


    @Override
    public List<CategoryVo> findAllGoodsInfo() {

        List<CategoryVo> goodsInfos = categoryMapper.findAllGoodsInfo();

        return goodsInfos;
    }
}
