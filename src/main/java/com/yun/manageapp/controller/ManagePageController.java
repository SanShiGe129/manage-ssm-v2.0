package com.yun.manageapp.controller;

import com.yun.manageapp.domain.entity.ManageInfo;
import com.yun.manageapp.domain.vo.ShowAllInfoVo;
import com.yun.manageapp.service.ManagepageService;
import com.yun.manageapp.util.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName ManagePageController
 * @Author lulei
 * @Data 2019/12/23 21:37
 */

@RestController
public class ManagePageController {

    @Resource
    ManagepageService managepageService;

    /**
     * 返回GoodsOutInfoVo的分页结果集,注意3表示isIn为空值!
     * @param userName 入库页面的用户名
     * @param isIn     入库页面的使用状态
     * @param pageIndex 入库页面的页码值
     * @return 返回GoodsOutInfoVo的结果集
     *
     * */
    @GetMapping("/showManageGoodsInfo")
    public Object showManageGoodsInfo(@RequestParam("userName") String userName,
                                      @RequestParam("isIn") String isIn,
                                      @RequestParam(value = "pageIndex",defaultValue = "1") String pageIndex
                                    ) {

        Object obj;

        try {

            if (StringUtils.isEmpty(isIn) || StringUtils.equals(isIn,"undefined")) {

                isIn = "3";

            }

            if (StringUtils.isEmpty(userName) || StringUtils.equals(userName,"undefined")) {

                userName = null;

            }

            int isInI = Integer.parseInt(isIn);
            Integer pageIndexI = Integer.parseInt(pageIndex);
            ShowAllInfoVo allInfos = managepageService.showGoodsOutInfo(userName, isInI, pageIndexI);

            obj = Result.success(allInfos);

        } catch (NumberFormatException e) {

            e.printStackTrace();
            obj = Result.error();

        }

        return obj;

    }

    @GetMapping("/showManageName")
    public Object showManageName() {

        Object temp;

        try {

            List<ManageInfo> manageNames = managepageService.showManageAllName();
            temp = Result.success(manageNames);

        } catch (Exception e) {
            e.printStackTrace();
            temp = Result.error();
        }

        return temp;
    }

    @GetMapping("/showUseManageName")
    public Object showUseManageName() {

        Object temp;

        try {

            List<ManageInfo> manageInfos = managepageService.showUseManageName();

            temp = Result.success(manageInfos);

        } catch (Exception e) {
            e.printStackTrace();
            temp = Result.error();
        }

        return temp;
    }
    
    @PostMapping("/updataManaisUse")
    public Object updataManaisUse(@RequestParam("manageId") String manageId) {
        
        Object temp = null;

        try {

            long manageIdL = Long.parseLong(manageId);
            Integer cnt = managepageService.updataManaUse(manageIdL);
            temp = Result.success(cnt);

        } catch (Exception e) {

            e.printStackTrace();
            temp = Result.error();

        }

        return temp;
    }

    @PostMapping("/updataManaNoUse")
    public Object updataManaNoUse(@RequestParam("manageId") String manageId) {

        Object temp;

        try {

            long manageIdL = Long.parseLong(manageId);
            Integer cnt = managepageService.updataManaNoUse(manageIdL);
            temp = Result.success(cnt);

        } catch (NumberFormatException e) {
            e.printStackTrace();
            temp = Result.error();
        }
        return temp;
    }

    @PostMapping("/uploadManageInfo")
    public Object uploadManageInfo(@RequestParam("userName") String userName) {

        Object temp;

        try {

            Integer cnt = managepageService.uploadmanageInfo(userName);
            temp = Result.success(cnt);

        } catch (Exception e) {

            e.printStackTrace();
            temp = Result.error();

        }

        return temp;
    }
}
