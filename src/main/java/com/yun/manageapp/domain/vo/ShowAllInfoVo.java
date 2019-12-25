package com.yun.manageapp.domain.vo;


import lombok.Data;

import java.util.List;

/**
 *
 * 对入库的信息和数量进行封装
 * @ClassName ShowAllInfoBean
 * @Author lulei
 * @Data 2019/11/7 18:03
 */


@Data
public class ShowAllInfoVo {
    List<GoodsOutInfoVo> infos;
    Integer cnt;
}
