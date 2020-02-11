package com.xqx.org.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xqx.org.service.IOrganizationService;
import com.xqx.ych.common.protocol.organization.School;
import com.xqx.ych.common.protocol.pageHelper.PageRes;
import com.xqx.ych.entity.*;
import com.xqx.ych.mapper.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrganizationServiceImpl implements IOrganizationService {
    @Resource
    private OrganizationMapper organizationMapper;
    @Resource
    private OrgTypeMapper orgTypeMapper;
    @Resource
    private OrgNatureMapper orgNatureMapper;
    @Resource
    private OrgLevelMapper orgLevelMapper;
    @Resource
    private OrgIntroduceMapper orgIntroduceMapper;

    @Override
    public int open(Organization organization, String detail) {
        int result = organizationMapper.insert(organization);
        if (result == 0) {
            return result;
        }
        int result1 = orgIntroduceMapper.insertSelective(detail);
        return result1;
    }

    @Override
    public School findByUser(String legalPerson) {
        OrganizationExample example = new OrganizationExample();
        example.createCriteria().andLegalPersonEqualTo(legalPerson);
        Organization organization = organizationMapper.findByLegalPerson(legalPerson);
        School school = new School();
        BeanUtils.copyProperties(organization, school);
        System.out.println(school);
        return school;
    }

    @Override
    public PageRes<OrgType> findAllOrgType(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OrgType> orgTypes = orgTypeMapper.selectAll();
        Page pages = (Page) orgTypes;
        PageRes<OrgType> pageInfo = new PageRes<OrgType>();
        BeanUtils.copyProperties(pages, pageInfo);
        pageInfo.setTotal((int) ((Page<OrgType>) orgTypes).getTotal());
        pageInfo.setList(orgTypes);
        return pageInfo;
    }

    @Override
    public PageRes<OrgNature> findAllNature(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OrgNature> orgNatures = orgNatureMapper.selectAll();
        Page pages = (Page) orgNatures;
        PageRes<OrgNature> pageInfo = new PageRes<OrgNature>();
        BeanUtils.copyProperties(pages, pageInfo);
        pageInfo.setTotal((int) ((Page<OrgNature>) orgNatures).getTotal());
        pageInfo.setList(orgNatures);
        return pageInfo;
    }

    @Override
    public PageRes<OrgLevel> findAllLevel(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OrgLevel> orgLevels = orgLevelMapper.selectAll();
        Page pages = (Page) orgLevels;
        PageRes<OrgLevel> pageInfo = new PageRes<OrgLevel>();
        BeanUtils.copyProperties(pages, pageInfo);
        pageInfo.setTotal((int) ((Page<OrgLevel>) orgLevels).getTotal());
        pageInfo.setList(orgLevels);
        return pageInfo;
    }
}
