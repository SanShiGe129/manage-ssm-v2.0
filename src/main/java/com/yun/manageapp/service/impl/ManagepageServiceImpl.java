package com.yun.manageapp.service.impl;

import com.yun.manageapp.config.PageCapacity;
import com.yun.manageapp.domain.entity.ManageInfo;
import com.yun.manageapp.domain.vo.GoodsOutInfoVo;
import com.yun.manageapp.domain.vo.ShowAllInfoVo;
import com.yun.manageapp.mapper.GoodsoutInfoMapper;
import com.yun.manageapp.mapper.ManageInfoMapper;
import com.yun.manageapp.service.ManagepageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName ManagepageServiceImpl
 * @Author lulei
 * @Data 2019/12/23 21:39
 */

@Service
public class ManagepageServiceImpl implements ManagepageService {

    @Resource
    private GoodsoutInfoMapper goodsoutInfoMapper;

    @Resource
    private ManageInfoMapper manageInfoMapper;

    @Override
    public ShowAllInfoVo showGoodsOutInfo(String userName, Integer isIn, Integer curPage) {


        ShowAllInfoVo showAllInfoVo = new ShowAllInfoVo();

        Integer pageSize = PageCapacity.pageSize;

        Integer pageIndex = (curPage-1)*pageSize;

        List<GoodsOutInfoVo> outInfoVos = goodsoutInfoMapper.findGoodsInfoByUserNameIsIn(userName,isIn,pageIndex,pageSize);

        Integer cnt = goodsoutInfoMapper.findGoodsInfoByUserNameIsInOfCnt(userName, isIn);

        showAllInfoVo.setInfos(outInfoVos);
        showAllInfoVo.setCnt(cnt);
        return showAllInfoVo;
    }

    @Override
    public List<ManageInfo> showManageAllName() {

        List<ManageInfo> manageNames = manageInfoMapper.getAllManage();

        return manageNames;
    }

    @Override
    public List<ManageInfo> showUseManageName() {

        List<ManageInfo> useManages = manageInfoMapper.getUseManage();

        return useManages;
    }

    @Override
    public Integer updataManaUse(Long manageId) {

        Integer cnt = manageInfoMapper.updataManaIsUse(manageId);


        return cnt;
    }

    @Override
    public Integer updataManaNoUse(Long manageId) {

        Integer cnt = manageInfoMapper.updataManaNoIsUse(manageId);

        return cnt;

    }

    @Override
    public Integer uploadmanageInfo(String manageName) {

        Integer cnt = manageInfoMapper.uploadManaInfo(manageName);

        return cnt;
    }
}
