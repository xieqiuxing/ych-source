package com.xqx.shiro.demo;

import com.xqx.shiro.demo.entity.User;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * Created by mr.chan on 2018/9/4.
 */
public class PasswordHelper {
    //随机数生成器
    private static RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

    //指定散列算法为md5
    private String algorithmName = "MD5";
    //散列迭代次数
    private final int hashIterations = 2;

    /**
     * 生成随机盐值对密码进行加密
     *
     * @param userLogin 登录识别串（用户名）
     * @return
     */
    public User encrypt(User userLogin) {
        userLogin.setPasswordSalt(randomNumberGenerator.nextBytes().
                toHex());
        String newPassword =
                new SimpleHash(algorithmName, userLogin.getPassword(),
                        ByteSource.Util.bytes(userLogin.getPasswordSalt()), hashIterations).toHex();


        userLogin.setPassword(newPassword);
        System.out.println("password:" + newPassword + "\tsalt:===" + userLogin.getPasswordSalt());
        return userLogin;

    }

    public static void main(String[] args) {
        User ndUser = new User();
        ndUser.setUserName("zhang");
        ndUser.setPassword("123456");
        new PasswordHelper().encrypt(ndUser);
    }
}
