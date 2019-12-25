package com.yun.manageapp.controller;

import com.yun.manageapp.service.InpageService;
import com.yun.manageapp.util.Result;
import com.yun.manageapp.util.UploadUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * 入库页面信息
 *
 * @ClassName InPageController
 * @Author lulei
 * @Data 2019/12/21 18:57
 */

@RestController
public class InPageController {

    @Resource
    private InpageService inpageService;

    @GetMapping("/showGoodsInfo")
    public Object showGoodsInfo(@Param("userName") String userName) {

        Object temp;

        try {
            Object goodsInfos = inpageService.findGoodsInfoByUserName(userName);

            temp = Result.success(goodsInfos);

        } catch (Exception e) {
            e.printStackTrace();
            temp = Result.error();
        }

        return temp;
    }

    @PostMapping("/uploadGoods")
    @CrossOrigin("*")
    public Object uploadGoods(@RequestBody @RequestParam("goodsInfoId") String goodsInfoId,
                              @RequestBody @RequestParam("isUse") String isUse,
                              @RequestBody @RequestParam(value="inImg",required = false) MultipartFile inImg
                              ) {

        Object temp;

        try {
            long idL = Long.parseLong(goodsInfoId);
            Integer isUseI = Integer.parseInt(isUse);

            String imgSrc = UploadUtils.saveImage(inImg);

            Integer cnt = inpageService.upDataOutGoods(idL,isUseI,imgSrc);
            temp = Result.success(cnt);

        } catch (Exception e) {
            e.printStackTrace();
            temp = Result.error();
        }

        return temp;
    }

    @PostMapping("/uploadGoodsNoImg")
    @CrossOrigin("*")
    public Object uploadGoodsNoImg(@RequestParam("goodsInfoId") String goodsInfoId,
                                   @RequestBody @RequestParam("isUse") String isUse
                                   ) {

        Object temp;

        try {

            long InfoIdL = Long.parseLong(goodsInfoId);
            int isUseI = Integer.parseInt(isUse);
            Integer cnt = inpageService.updataOutGoodsNoImg(InfoIdL, isUseI);

            temp = Result.success(cnt);
        } catch (Exception e) {

            e.printStackTrace();

            temp = Result.error();
        }

        return temp;

    }

}
