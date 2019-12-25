package com.yun.manageapp.service.impl;

import com.yun.manageapp.domain.vo.GoodsInfoVo;
import com.yun.manageapp.mapper.GoodsoutInfoMapper;
import com.yun.manageapp.service.InpageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InpageServiceImpl implements InpageService {

    @Resource
    private GoodsoutInfoMapper goodsoutInfoMapper;

    @Override
    public List<GoodsInfoVo> findGoodsInfoByUserName(String userName) {

        List<GoodsInfoVo> goodsInfos = goodsoutInfoMapper.findByUserName(userName);

        return goodsInfos;
    }


    @Override
    public Integer upDataOutGoods(Long goodsInfoId, Integer isUse, String inImg) {

        Integer cnt = goodsoutInfoMapper.updataGoodsOutInfo(goodsInfoId, isUse, inImg);

        return cnt;
    }

    @Override
    public Integer updataOutGoodsNoImg(Long goodsInfoId, Integer isUse) {

        Integer cnt = goodsoutInfoMapper.updataGoodsNoImg(goodsInfoId, isUse);

        return cnt;
    }
}
