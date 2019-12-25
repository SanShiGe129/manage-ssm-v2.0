package com.yun.manageapp.mapper;

import com.yun.manageapp.domain.entity.ManageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManageInfoMapper {

    /**
     *
     * 功能是在管理员页面展示管理员信息
     *
     * @return ManageInfo
     *
     */
    List<ManageInfo> getAllManage();

    /**
     *
     * 功能是在管理员页面展示可用管理员信息
     *
     * @return ManageInfo
     */
    List<ManageInfo> getUseManage();


    /**
     * 禁用管理员
     *
     * @param manageId 管理员页面的管理员id
     * @return 受影响的行数
     *
     */
    Integer updataManaIsUse(@Param("manageId") Long manageId);

    /**
     *
     * 启用管理员
     *
     * @param manageId 管理员页面的管理员id
     * @return 受影响的行数
     *
     */


    /**
     *
     * 禁用管理员
     *
     * @param manageId 管理员页面的管理员id
     * @return 受影响的行数
     *
     *
     */
    Integer updataManaNoIsUse(@Param("manageId") Long manageId);


    /**
     * 添加管理员
     *
     * @param manageName  管理员页面的姓名
     * @return 受影响的行数
     */
    Integer uploadManaInfo(@Param("manageName") String manageName);
}