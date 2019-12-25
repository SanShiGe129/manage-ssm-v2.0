package com.yun.manageapp.service;

import com.yun.manageapp.domain.entity.UserInfo;
import com.yun.manageapp.domain.vo.GoodsNameInfoVo;

import java.util.List;

public interface OutpageService {

    /**
     *
     *对入库的信息进行录入(用户名和物品名入库的是关联库里字段的id值)
     *
     * @param userName 入库页面的用户名
     * @param GoodsName 入库页面的物品名
     * @param cnt   入库页面的数量
     * @param mlimg  入库页面的图片路径
     * @return  受影响的行数
     */
    Integer insetOutGoods(String userName, String GoodsName, Integer cnt, String mlimg);

    /**
     * 模糊所有查询供用户选择填写
     * @return  物品名的集合
     */
    List<GoodsNameInfoVo> ShowGoodsAllName();
}
