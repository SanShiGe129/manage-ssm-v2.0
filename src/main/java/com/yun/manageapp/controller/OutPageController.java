package com.yun.manageapp.controller;

import com.yun.manageapp.domain.vo.GoodsNameInfoVo;
import com.yun.manageapp.service.OutpageService;
import com.yun.manageapp.util.Result;
import com.yun.manageapp.util.UploadUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName OutPageController
 * @Author lulei
 * @Data 2019/12/19 21:06
 */
@RestController
public class OutPageController {

    @Resource
    OutpageService outpageService;

    /**
     * 录入出库信息
     * @param userName  前端录入入库姓名
     * @param goodsName 前端录入物品名
     * @param outCnt    前端的录入数量
     * @param file      前端的图片文件
     * @return  Result结果集
     */
    @PostMapping("/insertGoods")
    @CrossOrigin(origins = "*")
    public Object insertGoods(@RequestBody @RequestParam("userName") String userName,
                              @RequestBody @RequestParam("goodsName") String goodsName,
                              @RequestBody @RequestParam("outCnt") String outCnt,
                              @RequestBody @RequestParam(value="mlFile",required = false) MultipartFile file
                              ){

        Object temp = null;

        try {
            String imgSrc = UploadUtils.saveImage(file);

            int tempOutCnt = Integer.parseInt(outCnt);
            Integer cnt = outpageService.insetOutGoods(userName, goodsName, tempOutCnt, imgSrc);
            temp = Result.success(cnt);

        } catch (Exception e) {
            e.printStackTrace();
            temp = Result.error();
        }
        return temp;
    }

    /**
     * 查询所有物品名存入前端页面,供用户选填
     * @return
     */
    @GetMapping("/showGoodsNames")
    @CrossOrigin(origins = "*")
    @ResponseBody
    public Object showGoodsNames() {

        Object temp = null;

        try {
            List<GoodsNameInfoVo> nameInfos = outpageService.ShowGoodsAllName();

            temp = Result.success(nameInfos);

        } catch (Exception e) {
            e.printStackTrace();
            temp = Result.error();
        }

        return temp;
    }
}
