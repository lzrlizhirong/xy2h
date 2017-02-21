package com.xy2h.dao;

import com.xy2h.entity.User;

import java.util.List;

/**
 * @Author lzr
 * @Version 1.0.0
 * @Date 2017/2/14
 * @Description
 */
public interface UserDao {

//    private long userId;
//    private String userName;
//    private String userNickName;
//    private String userPassword;
//    private String userEmail;
//    private Blob userAvatar;
//    private long userPhone;
//    private String userAddress;
//    private Date userBrithday;
//    private Date userRegisteTime;

    /**
     * 插入用户记录
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 根据用户ID查找用户
     * @param userId
     * @return
     */
    User queryUserById(long userId);

    /**
     * 查询所有的用户
     * @return
     */
    List<User> queryAllUsers();
}
