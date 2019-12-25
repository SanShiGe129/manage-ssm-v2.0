package com.yun.manageapp.service.impl;

import com.yun.manageapp.domain.entity.GoodsInfo;
import com.yun.manageapp.domain.entity.GoodsoutInfo;
import com.yun.manageapp.domain.entity.UserInfo;
import com.yun.manageapp.domain.vo.GoodsNameInfoVo;
import com.yun.manageapp.mapper.GoodsInfoMapper;
import com.yun.manageapp.mapper.GoodsoutInfoMapper;
import com.yun.manageapp.mapper.UserInfoMapper;
import com.yun.manageapp.service.OutpageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName OutpageServiceImpl
 * @Author lulei
 * @Data 2019/12/19 21:43
 *
 */
@Service
public class OutpageServiceImpl implements OutpageService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Resource
    private GoodsInfoMapper goodsInfoMapper;

    @Resource
    private GoodsoutInfoMapper goodsoutInfoMapper;

    @Override
    public Integer insetOutGoods(String userName, String GoodsName, Integer cnt, String mlimg) {

        UserInfo userInfo = userInfoMapper.findByUserName(userName);
        GoodsInfo goodsInfo = goodsInfoMapper.findGoodsIdByName(GoodsName);
        Integer temp = goodsoutInfoMapper.insertOutGoods(userInfo.getUserId(), goodsInfo.getGoodsId(), cnt, mlimg);

        return temp;
    }


    @Override
    public List<GoodsNameInfoVo> ShowGoodsAllName() {

        List<GoodsNameInfoVo> goodInfos = goodsInfoMapper.findByAllName();

        return goodInfos;
    }
}
