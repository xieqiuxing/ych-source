package com.xqx.org.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xqx.org.api.IOrganizationApi;
import com.xqx.org.api.IUserApi;
import com.xqx.ych.common.constans.ServerResponse;
import com.xqx.ych.common.protocol.organization.School;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.common.protocol.user.UserInfo;
import com.xqx.ych.entity.Organization;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/org")
@Slf4j
public class OrganizationController {
    @Reference
    private IOrganizationApi iOrganizationApi;
    @Reference
    private IUserApi iUserApi;

    @RequestMapping(value = "/school/open", method = RequestMethod.POST)
    public ServerResponse open(Organization organization, @RequestParam(value = "introduce", required = false) String detail) {
        organization.setOrgAuditStatus(1);
        organization.setCoverImg("https://kzych.oss-cn-qingdao.aliyuncs.com/kzych-dir/" + organization.getCoverImg());
        organization.setOrgLicenceImg("https://kzych.oss-cn-qingdao.aliyuncs.com/kzych-dir/" + organization.getOrgLicenceImg());
        int result = iOrganizationApi.open(organization, detail);
        if (result == 0) {
            log.info("[开通失败了]");
            return ServerResponse.createByErrorMessage("申请失败，请稍后重试...");
        }
        log.info("[开通成功了]：{}" + organization);
        return ServerResponse.createBySuccessMessage("申请成功，等待审核中...");
    }

    @RequestMapping(value = "/school/{userName}", method = RequestMethod.POST)
    public ServerResponse findByUser(@PathVariable String userName) {
        School school = iOrganizationApi.findByUser(userName);
        System.out.println(school);
        if (school == null) {
            return ServerResponse.createByErrorMessage("查询用户开通学校信息失败...");
        }
        return ServerResponse.createBySuccess("查询用户开通学校信息成功....", school);
    }

    @RequestMapping(value = "/school/openedFunc/{userName}")
    public ServerResponse findOpened(@PathVariable String userName) {
        UserInfo userInfo = iUserApi.findByUserName(userName);
        if (userInfo == null) {
            return ServerResponse.createByErrorMessage("获取用户开通信息失败...");
        }
        return ServerResponse.createBySuccess("获取用户开通信息成功....", userInfo);
    }

    @RequestMapping(value = "/org_type/list", method = RequestMethod.POST)
    public ServerResponse selectAllOrgType(@RequestParam(value = "pageNum", required = false) Integer pageNum,
                                           @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        if (pageNum == null) {
            pageNum = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        PageRes pageRes = iOrganizationApi.findAllOrgType(pageNum, pageSize);
        if (pageRes == null) {
            return ServerResponse.createByErrorMessage("获取机构等级信息失败...");
        }
        return ServerResponse.createBySuccess("获取等级信息成功....", pageRes);
    }

    @RequestMapping(value = "/org_nature/list", method = RequestMethod.POST)
    public ServerResponse selectAllNature(@RequestParam(value = "pageNum", required = false) Integer pageNum,
                                          @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        if (pageNum == null) {
            pageNum = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        PageRes pageRes = iOrganizationApi.findAllNature(pageNum, pageSize);
        if (pageRes == null) {
            return ServerResponse.createByErrorMessage("获取机构性质信息失败......");
        }
        return ServerResponse.createBySuccess("获取机构性质信息成功........", pageRes);
    }

    @RequestMapping(value = "/org_level/list", method = RequestMethod.POST)
    public ServerResponse selectAllLevel(@RequestParam(value = "pageNum", required = false) Integer pageNum,
                                         @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        if (pageNum == null) {
            pageNum = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        PageRes pageRes = iOrganizationApi.findAllLevel(pageNum, pageSize);
        if (pageRes == null) {
            return ServerResponse.createByErrorMessage("获取机构等级信息失败......");
        }
        return ServerResponse.createBySuccess("获取等级信息成功............", pageRes);
    }
}
