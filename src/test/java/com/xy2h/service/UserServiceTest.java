package com.xy2h.service;

import com.xy2h.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author lzr
 * @Version 1.0.0
 * @Date 2017/2/14
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml",
})
public class UserServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Test
    public void testInsertUser() throws Exception {
        String userName = "齐小黑";
        String password = "123456789";
        String email = "18862141550@163.com";
        User user = new User();
        long phone = 1882141550L;
        user.setUserName(userName);
        user.setUserPassword(password);
        user.setUserEmail(email);
        user.setUserPhone(phone);
        int insertCount = userService.insertUser(user);
        logger.info("insertCount={}",insertCount);
    }

    @Test
    public void testQueryUserById() throws Exception {

    }

    @Test
    public void testQueryAllUser() throws Exception {

    }
}