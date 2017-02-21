package com.xy2h.dao;

import com.xy2h.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/14
 * @Description
 */

//junit启动时加载SpringIOC容器
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit去哪找Spring的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testInsertUser() throws Exception {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        String userName = "齐小黑";
        String password = "123456789";
        String email = "18862141550@163.com";
        User user = new User();
        long phone = 1882141550L;
        user.setUserName(userName);
        user.setUserPassword(password);
        user.setUserEmail(email);
        user.setUserPhone(phone);
        int insertCount = userDao.insertUser(user);
        logger.info("insertCount={}",insertCount);
    }

    @Test
    public void testQueryUserById() throws Exception {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        long id = 4L;
        User user = userDao.queryUserById(id);
        logger.info("user={}",user.toString());
    }

    @Test
    public void testQueryAllUser() throws Exception {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        List<User> userList = userDao.queryAllUsers();
        for (User u:userList) {
            logger.info("userList={}"+u);
        }
    }
}