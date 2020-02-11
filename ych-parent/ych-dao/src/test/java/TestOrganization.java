import com.xqx.ych.mapper.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:xml/beans-dao.xml")

public class TestOrganization {
    @Resource
    private OrganizationMapper organizationMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private OrgMajorMapper orgMajorMapper;
    @Resource
    private OrgIntroduceMapper orgIntroduceMapper;
    @Resource
    private OrgAddressMapper orgAddressMapper;

    //    @Test
//    public void testPageHelper(){
//        PageHelper.startPage(0,5);
//        List<Organization> orgs = organizationMapper.selectByExample(null);
//        System.out.println("orgs------"+orgs);
//        //Page是List的子类，所以将org强转为Page
//        Page pageOrg=(Page)orgs;
//        System.out.println("pageOrg-----"+pageOrg);
//        //将pageOrg里面的数据裁剪到pageRes
//        PageRes<OrganizationRes> pageInfo=new PageRes<OrganizationRes>();
//        BeanUtils.copyProperties(pageOrg,pageInfo);
//        System.out.println("pageInfo1------"+pageInfo);
//        //定义一个集合裁剪后的对象
//        List<OrganizationRes> orgList=new ArrayList<OrganizationRes>();
//        //将Organization的数据裁剪到api文档中的需要的数据
//        for (Organization org:orgs) {
//            OrganizationRes orgRes=new OrganizationRes();
//            BeanUtils.copyProperties(org,orgRes);
//            orgList.add(orgRes);
//        }
//        pageInfo.setList(orgList);
//        System.out.println("pageInfo2----"+pageInfo);
//        //清空orgList,节省内存空间
//        orgList=null;
//    }
//    @Test
//    public void testAddUser(){
//        User user=new User();
//        user.setUserNickname("李四");
//        user.setUserName("lisi");
//        user.setUserPassword("123456");
//        user.setUserEmail("2994892782@qq.com");
//        user.setSalt("lisi123456");
//        user.setUserType(2);
//
//        int result=userMapper.insert(user);
//        System.out.println(result);
//    }
//    @Test
//    public void getSchool(){
//        int id=1;
//        Organization organization=organizationMapper.selectByPrimaryKey(id);
//        OrganizationInfo schoolRes=new OrganizationInfo();
//        BeanUtils.copyProperties(organization,schoolRes);
//        System.out.println(schoolRes);
//    }
//    @Test
//    public void change(){
//        Organization organization=new Organization();
//        organization.setOrgAuditStatus(2);
//        int i=organizationMapper.updateByPrimaryKey(organization);
//    }
////    @Test
////    public void findByCondition(){
////        List<Organization> organization=organizationMapper.findByCondition("湖南省",null,null,null);
////        System.out.println(organization);
////    }
//    @Test
//    public void listByPageUser(){
//        PageHelper.startPage(1,10);
//        UserExample example=new UserExample();
//        example.createCriteria().andUserTypeEqualTo(2);
//        List<User> users=userMapper.selectByExample(example);
//        Page pageUser=(Page)users;
//        System.out.println("pageUser====="+pageUser);
//        PageRes<UserRes> pageInfo=new PageRes<UserRes>();
//        BeanUtils.copyProperties(pageUser,pageInfo);
//        List<UserRes> userList=new ArrayList<UserRes>();
//        for (User user:users) {
//            UserRes userRes=new UserRes();
//            BeanUtils.copyProperties(user,userRes);
//            userList.add(userRes);
//        }
//        pageInfo.setTotal((int) ((Page<User>) users).getTotal());
//        pageInfo.setList(userList);
//        System.out.println(pageInfo);
//    }
////    @Test
////    public void findByIdAndMajor(){
////        SchoolIntroduce schoolIntroduce= orgMajorMapper.findByIdAndMajor(1,1);
////        System.out.println(schoolIntroduce);
////    }
//    @Test
//    public void addOrg() {
//        Organization organization = new Organization();
//        organization.setName("湖南学院");
//        String detail = "niubi";
//        int result = organizationMapper.insert(organization);
//        if (result == 0) {
//            System.out.println("保存失败");
//        }
//        int result1 = orgIntroduceMapper.insertSelective(detail);
//        System.out.println("结果为：======" + result1);
//    }
//
//    @Test
//    public void changeAudit() {
//        System.out.println("改成功了+++" + organizationMapper.changeAudit(17, 0));
//    }
//
//    @Test
//    public void findByCondition() {
//        List<Organization> list = organizationMapper.findByCondition("湖南省", "长沙市", "岳麓区", "湖南大学");
//        System.out.println(list);
//    }

    //    @Test
//    public void findLocation() {
//        OrganizationExample example1 = new OrganizationExample();
//        example1.createCriteria().andOrgLevelEqualTo(1);
//        List<Organization> orgs = organizationMapper.selectByExample(example1);
//        List<SchoolType> pages = new ArrayList<SchoolType>();
//        for (Organization org : orgs) {
//            OrgAddress orgAddress = orgAddressMapper.findByOrgId(org.getId());
//            AddressLocation addressLocation = new AddressLocation();
//            BeanUtils.copyProperties(orgAddress, addressLocation);
//            SchoolType schoolType = new SchoolType();
//            BeanUtils.copyProperties(org, schoolType);
//            schoolType.setLocation(addressLocation);
//            pages.add(schoolType);
//        }
//        System.out.println(pages);
//    }
    @Test
    public void Test01() {
        System.out.println(orgMajorMapper.findByOrgMajorId(1));
        System.out.println(orgMajorMapper.findCouponByUserId(1));
        System.out.println(orgMajorMapper.findUserNameById(111));
    }
}
