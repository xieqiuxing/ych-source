package com.xqx.manage.realm;

import com.xqx.ych.entity.User;
import com.xqx.ych.entity.UserExample;
import com.xqx.ych.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description: 用一句话描述
 * @Auther: 新梦想*陈超
 * @Date: 2019-12-16 09:34
 */
@Slf4j
public class UserRealm extends AuthorizingRealm {

    @Resource
    private UserMapper userMapper;

    /*授权*/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //1.身份
        String userName = (String) principalCollection.getPrimaryPrincipal();
        //2.身份获取角色和权限
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //根据身份从数据库获取该身份拥有的角色或权限
        //假设zhang这个用户拥有admin角色，和user:create  user:update menu:create
        Set<String> roles = new HashSet<>();
        //授予权限
        Set<String> permitions = new HashSet();
        //严格上来说应该要根据用户查询数据库，得到该用户的用户类型，根据
        //用户类型，授予不同的权限。
        if (userName.equals("admin")) {
            roles.add("admin");
            authorizationInfo.setRoles(roles);
        } else {
            roles.add("guest");
            authorizationInfo.setRoles(roles);
        }
        authorizationInfo.setStringPermissions(permitions);

        //log.info("【授权信息为：{}】",authorizationInfo.getRoles().iterator().next());
        log.info("【授权信息为：{}】", authorizationInfo.getStringPermissions().iterator().next());
        return authorizationInfo;

    }

    /*身份认证*/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //两个关键：身份   +  证明或凭证
        //1.身份(登录的用户名)
        String principal = (String) authenticationToken.getPrincipal();//身份(用户名)
        System.out.println("身份=====" + principal);
        //2.凭证（数据库）
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(principal);
        System.out.println("principal=====" + principal);
        List<User> users = userMapper.selectByExample(example);
        System.out.println("users===" + users);
        if (users == null || users.size() <= 0) {
            return null;
        }
        System.out.println("users===" + users);
        User user = users.get(0);
        System.out.println("user===" + user);
        if (user == null) {
            log.warn("[查询用户信息为：null]");
            return null;
        }
        System.out.println("[登录的查询用户信息为：{}]" + user);
        //将用户信息保存session（shiro提供的session）
        SecurityUtils.getSubject().getSession().setAttribute("userLogin", user);
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(principal,
                user.getUserPassword(),    //密文
                ByteSource.Util.bytes(user.getSalt()), //盐
                getName());
        return authenticationInfo;
    }
}
