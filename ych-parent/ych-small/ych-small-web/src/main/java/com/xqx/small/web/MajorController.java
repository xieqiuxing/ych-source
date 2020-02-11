package com.xqx.small.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xqx.ych.common.constans.ServerResponse;
import com.xqx.ych.common.protocol.major.MajorPop;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.entity.Major;
import com.xqx.ych.entity.MajorCategory;
import com.xqx.ych.small.api.IMajorApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/major")
public class MajorController {
    @Reference
    private IMajorApi iMajorApi;

    @RequestMapping("/major_category_list")
    public ServerResponse findAllMajor(@RequestParam(value = "pageNum", required = false) Integer pageNum,
                                       @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        if (pageNum == null) {
            pageNum = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        PageRes<MajorCategory> pageRes = iMajorApi.findAllMajor(pageNum, pageSize);
        if (pageRes == null) {
            return ServerResponse.createByErrorMessage("查询失败");
        }
        return ServerResponse.createBySuccess("查询成功", pageRes);
    }

    @RequestMapping("/category_major_list")
    public ServerResponse findByCateId(@RequestParam(value = "pageNum", required = false) Integer pageNum,
                                       @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                       @RequestParam(value = "majorCategoryId", required = false) Integer categoryId) {
        System.out.println("category_id===" + categoryId);
        if (pageNum == null) {
            pageNum = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        PageRes<Major> pageRes = iMajorApi.findByCateId(pageNum, pageSize, categoryId);
        System.out.println("pageRes===" + pageRes);
        if (pageRes == null) {
            return ServerResponse.createByErrorMessage("查询失败");
        }
        return ServerResponse.createBySuccess("查询成功", pageRes);
    }

    @RequestMapping(value = "/pop_major_list", method = RequestMethod.GET)
    public ServerResponse findPopMajor(@RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                       @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize,
                                       @RequestParam(value = "isHot", required = false) Integer isHot) {
        PageRes<MajorPop> pageRes = iMajorApi.findPopMajor(pageNum, pageSize, isHot);
        if (pageRes == null || pageRes.getList().size() <= 0) {
            return ServerResponse.createByErrorMessage("查询失败");
        }
        return ServerResponse.createBySuccess("查询成功", pageRes);
    }
}
