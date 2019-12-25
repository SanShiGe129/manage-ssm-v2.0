package com.yun.manageapp.mapper;

import com.yun.manageapp.domain.entity.GoodsInfo;
import com.yun.manageapp.domain.vo.GoodsInfoVo;
import com.yun.manageapp.domain.vo.GoodsNameInfoVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName GoodsNameInfoVo
 * @Author lulei
 * @Data 2019/12/19 20:04
 */
public interface GoodsInfoMapper {

    /**
     * 功能是查询所有物品在出库页面显示,供用户选择!
     * @return GoodsNameInfoVo (extend GoodsNameInfo)
     */
    List<GoodsNameInfoVo> findByAllName();

    /**
     * 更据goodsName查询类GoodsInfo中的goodsId值,功能是
     * 是在StockMapper中查询某一货物的库存
     * @param goodsName 货物名
     * @return
     */
    GoodsInfo findGoodsIdByName(@Param("name") String goodsName);
}