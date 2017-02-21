package com.xy2h.service;

import com.xy2h.entity.User;

import java.util.List;

/**
 * @Author lzr
 * @Version 1.0.0
 * @Date 2017/2/14
 * @Description
 */
public interface UserService{

    int insertUser(User user);
    User queryUserById(long userId);
    List<User> queryAllUser();
}
