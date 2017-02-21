package com.xy2h.service.impl;

import com.xy2h.dao.UserDao;
import com.xy2h.entity.User;
import com.xy2h.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author lzr
 * @Version 1.0.0
 * @Date 2017/2/14
 * @Description
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;


    public int insertUser(User user) {
        int insertCount = userDao.insertUser(user);
        return insertCount;
    }

    public User queryUserById(long userId) {
        User user = userDao.queryUserById(userId);
        return user;
    }

    public List<User> queryAllUser() {
        List<User> userList = userDao.queryAllUsers();
        return userList;
    }
}
