package com.yun.manageapp.service;

import com.yun.manageapp.domain.entity.ManageInfo;
import com.yun.manageapp.domain.vo.GoodsOutInfoVo;
import com.yun.manageapp.domain.vo.ShowAllInfoVo;
import com.yun.manageapp.domain.vo.ShowDetailInfoVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ManagepageService
 * @Author lulei
 * @Data 2019/12/23 21:38
 */


public interface ManagepageService {

    /**
     *
     * 返回GoodsOutInfoVo的分页结果集 以及返回查询结果的数量
     *
     * @param userName 入库页面的用户名
     * @param isIn     入库页面的使用状态
     * @param curPage 入库页面的当前页
     * @return 返回GoodsOutInfoVo的结果集
     *
     * */
    ShowAllInfoVo showGoodsOutInfo(String userName,
                                   Integer isIn,
                                   Integer curPage
    );

    /**
     * 功能是查询所有管理员姓名
     *
     * @return
     */
    List<ManageInfo> showManageAllName();

    /**
     * 功能是展示可用管理员姓名
     *
     * @return ManageInfo
     */
    List<ManageInfo> showUseManageName();

    /**
     * 启用管理员
     *
     * @param manageId 管理员页面的管理员信息id
     * @return 受影响的行数
     */
    Integer updataManaUse(Long manageId);

    /**
     *
     * 禁用管理员
     *
     * @param manageId 管理员页面的管理员信息id
     * @return 受影响的行数
     */
    Integer updataManaNoUse(Long manageId);


    /**
     * 添加管理员
     *
     * @param manageName
     * @return
     */
    Integer uploadmanageInfo(String manageName);

    /**
     * 根据goodsoutId查询详情信息,功能是在详情页面输出物品的详情信息!
     *
     * @param goodsoutId 出库页面的id
     * @return ShowDetailInfoVo
     *
     */
    ShowDetailInfoVo findGoodsDetailById(Long goodsoutId);

    /**
     * 根据goodsId修改is_verify字段,
     * @param goodsoutId 管理员页面的id值
     * @return 受影响的行数
     * 
     */
    Integer upDataIsVerify(Long goodsoutId);

}
