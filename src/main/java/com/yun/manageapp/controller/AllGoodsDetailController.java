package com.yun.manageapp.controller;

import com.yun.manageapp.domain.vo.CategoryVo;
import com.yun.manageapp.service.AllGoodsDetailService;
import com.yun.manageapp.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName AllGoodsDetailController
 * @Author lulei
 * @Data 2019/12/27 0:01
 */

@RestController
public class AllGoodsDetailController {

    @Resource
    AllGoodsDetailService allGoodsDetailService;

    @GetMapping("/showCategoryGoodsInfo")
    public Object showCategoryGoodsInfo(){

        Object temp;

        try {
            List<CategoryVo> infos = allGoodsDetailService.findAllGoodsInfo();
            temp = Result.success(infos);


        } catch (Exception e) {
            e.printStackTrace();

            temp = Result.error();
        }

        return temp;
    }
}
