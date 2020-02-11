package com.xqx.small.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xqx.ych.common.constans.ServerResponse;
import com.xqx.ych.common.protocol.major.Majors;
import com.xqx.ych.common.protocol.organization.OrganizationDynamic;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.common.protocol.school.IntroduceDetail;
import com.xqx.ych.common.protocol.school.PopSchool;
import com.xqx.ych.common.protocol.school.SchoolMajor;
import com.xqx.ych.common.protocol.school.SchoolType;
import com.xqx.ych.entity.SchoolInfo;
import com.xqx.ych.entity.SchoolIntroduce;
import com.xqx.ych.entity.UserEnroll;
import com.xqx.ych.small.api.IOrganizationApi;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/school")
public class OrganizationController {
    @Reference
    private IOrganizationApi iOrganizationApi;

    @RequestMapping("/major_school_list")
    public ServerResponse findById(@RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                   @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize,
                                   @RequestParam(value = "majorId", required = false) Integer majorId) {

        System.out.println("id====" + majorId);
        PageRes<SchoolInfo> pageRes = iOrganizationApi.findByMajorId(pageNum, pageSize, majorId);
        System.out.println("pageRes=====" + pageRes);
        if (pageRes == null) {
            return ServerResponse.createByErrorMessage("查询失败");
        }
        return ServerResponse.createBySuccess("查询成功", pageRes);
    }

    @RequestMapping(value = "/major_school_detail", method = RequestMethod.GET)
    public ServerResponse findByIdAndMajor(@RequestParam(value = "id", required = false) Integer id,
                                           @RequestParam(value = "majorId", required = false) Integer majorId) {
        SchoolIntroduce schoolIntroduce = iOrganizationApi.findByIdAndMajor(id, majorId);
        if (schoolIntroduce == null) {
            return ServerResponse.createByErrorMessage("查询失败");
        }
        return ServerResponse.createBySuccess("查询成功", schoolIntroduce);
    }

    @RequestMapping(value = "/pop_school_list", method = RequestMethod.GET)
    public ServerResponse findPopSchool(@RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                        @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize,
                                        @RequestParam(value = "isHot", required = false) Integer isHot) {
        PageRes<PopSchool> pageRes = iOrganizationApi.findPopSchool(pageNum, pageSize, isHot);
        if (pageRes == null || pageRes.getList().size() == 0) {
            return ServerResponse.createByErrorMessage("查询失败");
        }
        return ServerResponse.createBySuccess("查询成功", pageRes);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ServerResponse listSchool(@RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                     @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize,
                                     @RequestParam(value = "categoryId", required = false, defaultValue = "1") Integer orgLevel) {
        System.out.println("orgLevel=====" + orgLevel);
        PageRes<SchoolType> pageRes = iOrganizationApi.findByOrgLevel(pageNum, pageSize, orgLevel);
        if (pageRes == null || pageRes.getList().size() <= 0) {
            return ServerResponse.createByErrorMessage("查询失败");
        }
        System.out.println("pageRes===" + pageRes.getList());
        return ServerResponse.createBySuccess("查询成功", pageRes);
    }


    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public ServerResponse findById(@RequestParam(value = "universityId") Integer id,
                                   @RequestParam(value = "currentNum", defaultValue = "0") Integer currentNum) {
        if (currentNum == 0) {
            System.out.println("666666" + findOrgIntroduce(id));
            return findOrgById(id);
        } else if (currentNum == 1) {
            System.out.println("77777" + findOrgIntroduce(id).getData());
            return findOrgIntroduce(id);
        } else if (currentNum == 2) {
            System.out.println("888888" + findOrgDynamic(id).getData());
            return findOrgDynamic(id);
        } else {
            return ServerResponse.createByErrorMessage("查询失败");
        }
    }

    public ServerResponse findOrgById(Integer id) {
        SchoolMajor<Majors> pageRes = iOrganizationApi.findByOrgId(id);
        System.out.println(pageRes);
        if (pageRes == null || pageRes.getList().size() <= 0) {
            return ServerResponse.createByErrorMessage("查询失败");
        }
        return ServerResponse.createBySuccess("查询成功", pageRes);
    }

    public ServerResponse findOrgIntroduce(Integer id) {
        SchoolMajor<IntroduceDetail> introduceDetail = iOrganizationApi.findOrgIntroduce(id);
        if (introduceDetail == null) {
            return ServerResponse.createByErrorMessage("查询失败");
        }
        return ServerResponse.createBySuccess("查询成功", introduceDetail);
    }

    public ServerResponse findOrgDynamic(Integer id) {
        SchoolMajor<OrganizationDynamic> pageRes = iOrganizationApi.findOrgDynamic(id);
        if (pageRes == null || pageRes.getList().size() <= 0) {
            return ServerResponse.createByErrorMessage("查询失败");
        }
        return ServerResponse.createBySuccess("查询成功", pageRes);
    }

    @RequestMapping(value = "/getEnroll", method = RequestMethod.GET)
    public ServerResponse findByOrgMajorIdAndUserId(@RequestParam(value = "orgmajorid") Integer orgMajorId,
                                                    @RequestParam(value = "userid") Integer userId) {
        UserEnroll userEnroll = iOrganizationApi.findByOrgMajorIdAndUserId(orgMajorId, userId);
        System.out.println("userEnroll====" + userEnroll + "orgMajorId==" + orgMajorId + "userId===" + userId);
        if (userEnroll == null) {
            return ServerResponse.createByErrorMessage("查询失败");
        }
        return ServerResponse.createBySuccess("查询成功", userEnroll);
    }
}
