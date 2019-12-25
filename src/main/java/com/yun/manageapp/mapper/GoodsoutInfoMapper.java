package com.yun.manageapp.mapper;


import com.yun.manageapp.domain.vo.GoodsInfoVo;
import com.yun.manageapp.domain.vo.GoodsOutInfoVo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface GoodsoutInfoMapper {

    /**
     *
     *  插入userId,goodsId,outCnt,imgSrc 实现录入需要入库信息的功能!
     *
     * @param userId  UserInfoMapper查询出的用户表的id
     * @param goodsId GoodsInfoMapper查询出的物品表的id
     * @param outCnt 出库物品的数量
     * @param imgSrc  图片的路径
     * @return 受影响的行数
     */
    Integer insertOutGoods(@Param("userId") Long userId,
                           @Param("goodsId") Long goodsId,
                           @Param("outCnt") Integer outCnt,
                           @Param("imgSrc") String imgSrc
    );

    /**
     * 根据userName查询用户表(user_info)中的主键id,用sql语句where in查询表goodsout_info中的user_id,
     * 再与goodsInfo关联之后的表goodsout_info中的goods_id进行联合查询
     * 实现在入库页面展示某用户的已出库信息(物品名,物品的序列号,出库时间,出库数量)
     *
     * @param userName 入库页面的用户名
     * @return GoodsoutInfoVo (extend GoodsoutInfo)
     */
    List<GoodsInfoVo> findByUserName(@Param("userName") String userName);

    /**
     *根据goodsoutId修改goodsout_info中的字段,功能是实现对入库页面的物品信息录入
     *
     * @param goodsoutId 数据库goodsout_info的主键
     * @param isUse 入库页面的是否使用字段
     * @param outImg 入库页面的入库图片路径
     * @return 受影响的行数
     */
    Integer updataGoodsOutInfo(@Param("goodsoutId") Long goodsoutId,
                               @Param("isUse") Integer isUse,
                               @Param("outImg") String outImg);


    /**
     * 根据goodsoutId修改goodsout_info中的字段,功能是实现对入库页面的物品信息无图片选项进行录入
     *
     * @param goodsoutId 数据库goodsout_info的主键
     * @param isUse 入库页面的是否使用字段
     * @return 受影响的行数
     *
     */
    Integer updataGoodsNoImg(@Param("goodsoutId") Long goodsoutId,
                             @Param("isUse") Integer isUse);



    //********** 各种查询 ************


    /**
     * 姓名,物料名,是否使用,状态(未审核,未入库,已入库) 根据姓名或根据入库状态查询(已入库,为入库)在加上查询所有的字段
     *
     */


    /**
     *
     * 详情请查阅相关sql语句,实现的功能是通过用户名和入库的状态进行联合分页查询
     *
     * @param userName 管理员查询页面的用户名
     * @param isIn  管理员查询页面的是否入库页面
     * @param pageIndex 分页的起始页
     * @param pageSize 分页的数量
     * @return goodsInfoVo
     */
    List<GoodsOutInfoVo> findGoodsInfoByUserNameIsIn(@Param("userName") String userName,
                                                     @Param("isIn") Integer isIn,
                                                     @Param("pageIndex") Integer pageIndex,
                                                     @Param("pageSize") Integer pageSize
    );

    /**
     *
     * 详情请查阅相关sql语句,实现的功能是动态的展示各种查询的数量
     *
     * @param userName 管理员查询页面的用户名
     * @param isIn  管理员查询页面的是否入库页面
     * @return  查询结果的数量
     *
     */
    Integer findGoodsInfoByUserNameIsInOfCnt(@Param("userName") String userName,
                                             @Param("isIn") Integer isIn
    );




}