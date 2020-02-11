package com.xqx.manage.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xqx.ych.common.constans.ServerResponse;
import com.xqx.ych.common.protocol.organization.OrganizationInfo;
import com.xqx.ych.common.protocol.organization.OrganizationRes;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.manage.api.OrganizationApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/school")
@Slf4j
//@RequiresRoles("admin")
public class OrganizationController {
    private Integer pageNum = 1;
    private Integer pageSize = 10;
    @Reference
    private OrganizationApi organizationApi;

    @RequestMapping(value = "/listByPage/{auditStatus}", method = RequestMethod.GET)
    public ServerResponse findAll(@PathVariable Integer auditStatus,
                                  @RequestParam(value = "page", required = false, defaultValue = "1") Integer pageNum,
                                  @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize
    ) {
        PageRes<OrganizationRes> pageRes = organizationApi.findAll(pageNum, pageSize, auditStatus);
        if (pageRes == null) {
            log.info("所有学校查询失败了");
            return ServerResponse.createBySuccessMessage("查询失败");
        }
        log.info("[查询学校信息成功]{}:" + pageRes.getList());
        return ServerResponse.createBySuccess("查询成功", pageRes);
    }

    @RequestMapping(value = "/getSchool/{id}", method = RequestMethod.GET)
    public ServerResponse get(@PathVariable Integer id) {
        OrganizationInfo school = organizationApi.getOrganizationInfo(id);
        if (school == null) {
            log.info("[查询学校信息失败]");
            return ServerResponse.createByErrorMessage("查询失败");
        }
        log.info("[查询学校信息成功]{}：" + school);
        return ServerResponse.createBySuccess("查询成功", school);
    }

    @RequestMapping(value = "/audit", method = RequestMethod.POST)
    public ServerResponse change(@RequestParam(value = "id", required = false) Integer id,
                                 @RequestParam(value = "orgAuditStatus", required = false) Integer orgAuditStatus) {
        System.out.println("页面传过来的id===" + id);
        System.out.println("页面传过来的orgAuditStatus===" + orgAuditStatus);
        int result = organizationApi.changeAudio(id, orgAuditStatus);
        if (result == 0) {
            return ServerResponse.createByErrorMessage("审核失败");
        }
        return ServerResponse.createBySuccessMessage("审核成功");
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ServerResponse findByExample(@RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize,
                                        @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                        @RequestParam(value = "province", required = false) String province,
                                        @RequestParam(value = "city", required = false) String city,
                                        @RequestParam(value = "county", required = false) String county,
                                        @RequestParam(value = "name", required = false) String condition) {
        System.out.println("省：" + province + "市：" + city + "县/区" + county + "名字：" + condition);
        PageRes<OrganizationInfo> orgList = organizationApi.findByExample(pageNum, pageSize, province, city, county, condition);
        System.out.println("orgList" + orgList.getList());
        if (orgList == null || orgList.getList().size() == 0) {
            return ServerResponse.createByErrorMessage("查询失败");
        }
        log.info("【根据条件查询学校信息成功】:{}" + orgList);
        return ServerResponse.createBySuccess("查询成功", orgList);
    }
}
