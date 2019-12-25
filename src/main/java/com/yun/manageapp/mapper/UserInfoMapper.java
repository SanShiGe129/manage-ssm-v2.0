package com.yun.manageapp.mapper;

import com.yun.manageapp.domain.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {

    /**
     *
     *更据name查询出user_id,实现的功能是在GoodsoutInfoMapper中进行录入数据库
     *
     * @param name 出库页面的用户名
     * @return UserInfo
     */
    UserInfo findByUserName(@Param("name") String name);
}