package com.yun.manageapp.service;

import com.yun.manageapp.domain.vo.GoodsInfoVo;

import java.util.List;

public interface InpageService {

    /**
     * 根据userName查询已入库的信息,功能是对入库页面的信息进行业务整合
     *
     * @param userName
     * @return
     */
    List<GoodsInfoVo>  findGoodsInfoByUserName(String userName);

    /**
     * 根据goodsInfoId 进行插入 功能是录入入库信息
     *
     * @param goodsInfoId 页面的goodsInfoId信息
     * @param isUse 是否使用
     * @param inImg 入库的图片
     * @return 受影响的行数
     */
    Integer upDataOutGoods(Long goodsInfoId, Integer isUse, String inImg);

    /**
     *
     * 根据goodsInfoId 进行插入 功能是录入入库的无图片信息
     *
     * @param goodsInfoId 页面的goodsInfoId信息
     * @param isUse 是否使用
     * @return 受影响的行数
     */

    Integer updataOutGoodsNoImg(Long goodsInfoId, Integer isUse);


}
