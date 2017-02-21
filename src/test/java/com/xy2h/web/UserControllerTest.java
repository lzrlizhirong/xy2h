package com.xy2h.web;

import com.xy2h.dto.RegisterResult;
import com.xy2h.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/14
 * @Description
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml",
        "classpath:spring/spring-web.xml",
})
public class UserControllerTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserController userController;

    @Test
    public void testGetRegisterStatus() throws Exception {
        String userName = "齐小黑";
        String password = "123456789";
        String email = "18862141550@163.com";
        User user = new User();
        long phone = 1882141550L;
        user.setUserName(userName);
        user.setUserPassword(password);
        user.setUserEmail(email);
        user.setUserPhone(phone);
        RegisterResult registerResult = userController.getRegisterStatus(user);
        logger.info("registerResult={}",registerResult);
    }
}