package com.xqx.shiro.demo.realm;

import com.xqx.shiro.demo.entity.User;
import com.xqx.shiro.demo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 用一句话描述
 * @Auther: 新梦想*陈超
 * @Date: 2019-12-16 09:34
 */
@Service
@Slf4j
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserMapper userMapper;

    /*授权*/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /*认证*/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //两个关键：身份   +  证明或凭证
        //1.身份(登录的用户名)
        String principal = (String) authenticationToken.getPrincipal();//身份(用户名)
        //2.凭证（数据库）
        User user = userMapper.findUserByUserName(principal);
        System.out.println("[登录的查询用户信息为：{}]" + user);
        /*
           要将用户的凭证返回给shiro:用户名，用户加密后的密码，盐，shiro将其缓存起来。

           下次再登录的时候，shiro根据用户名，明文密码到shiro缓存中匹配用户凭证


           md5加密算法
            普通md5加密： 密码(123456)--->md5算法---->密文的密码（Af09dfasdf333d）
            md5加密+加盐：密码(123456)+盐(数据库)--->md5算法2次加密---->密文的密码（Af09dfasdf333d）
         */
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(principal,
                user.getPassword(),    //密文
                ByteSource.Util.bytes(user.getPasswordSalt()), //盐
                getName());

        return authenticationInfo;
    }
}
