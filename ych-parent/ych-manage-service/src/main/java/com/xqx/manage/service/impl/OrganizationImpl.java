package com.xqx.manage.service.impl;

import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xqx.manage.service.IOrganizationService;
import com.xqx.ych.common.protocol.organization.OrganizationInfo;
import com.xqx.ych.common.protocol.organization.OrganizationRes;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.entity.Organization;
import com.xqx.ych.entity.OrganizationExample;
import com.xqx.ych.mapper.OrganizationMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class OrganizationImpl implements IOrganizationService {
    @Resource
    private OrganizationMapper organizationMapper;

    @Override
    public PageRes<OrganizationRes> findAll(Integer pageNum, Integer pageSize, Integer auditStatus) {
        PageHelper.startPage(pageNum, pageSize);

        OrganizationExample example = new OrganizationExample();
        if (auditStatus == -1) {
            example = null;
        } else {
            example.createCriteria().andOrgAuditStatusEqualTo(auditStatus);
        }
        List<Organization> orgs = organizationMapper.selectByExample(example);
        Page pageOrg = (Page) orgs;
        PageRes<OrganizationRes> pageInfo = new PageRes<OrganizationRes>();
        BeanUtils.copyProperties(pageOrg, pageInfo);
        List<OrganizationRes> orgList = new ArrayList<OrganizationRes>();
        for (Organization org : orgs) {
            OrganizationRes organizationRes = new OrganizationRes();
            BeanUtils.copyProperties(org, organizationRes);
            orgList.add(organizationRes);
        }
        pageInfo.setTotal((int) ((Page<Organization>) orgs).getTotal());
        pageInfo.setList(orgList);
        System.out.println(orgList);
        return pageInfo;
    }

    @Override
    public OrganizationInfo getOrganizationInfo(Integer id) {
        Organization org = organizationMapper.selectByPrimaryKey(id);
        OrganizationInfo orgInfo = new OrganizationInfo();
        BeanUtils.copyProperties(org, orgInfo);
        return orgInfo;
    }

    @Override
    public int changeAudio(Integer id, Integer orgAuditStatus) {
        int result = organizationMapper.changeAudit(id, orgAuditStatus);
        return result;
    }

    @Override
    public PageRes<OrganizationInfo> findByExample(int pageNum, int pageSize, String province, String city, String county, String condition) {
        System.out.println("省" + province + "市" + city + county + "县");
        PageHelper.startPage(pageNum, pageSize);
        List<Organization> organizations = organizationMapper.findByCondition(province, city, county, condition);
        Page orgPage = (Page) organizations;
        PageRes<OrganizationInfo> pageInfo = new PageRes<OrganizationInfo>();
        BeanUtils.copyProperties(orgPage, pageInfo);
        List<OrganizationInfo> orgList = new ArrayList<OrganizationInfo>();
        for (Organization org : organizations) {
            OrganizationInfo orgInfo = new OrganizationInfo();
            BeanUtils.copyProperties(org, orgInfo);
            orgList.add(orgInfo);
        }
        pageInfo.setTotal((int) ((Page<Organization>) organizations).getTotal());
        pageInfo.setList(orgList);
        orgList = null;
        return pageInfo;
    }

}
