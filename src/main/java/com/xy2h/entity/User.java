package com.xy2h.entity;

import java.sql.Blob;
import java.util.Date;

/**
 * @Author lzr
 * @Version 1.0.0
 * @Date 2017/2/14
 * @Description 用户注册对应的实体类
 */
public class User {
    private long userId;
    private String userName;
    private String userNickName;
    private String userPassword;
    private String userEmail;
    private Blob userAvatar;
    private long userPhone;
    private String userAddress;
    private Date userBrithday;
    private Date userRegisteTime;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userNickName='" + userNickName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAvatar=" + userAvatar +
                ", userPhone=" + userPhone +
                ", userAddress='" + userAddress + '\'' +
                ", userBrithday=" + userBrithday +
                ", userRegisteTime=" + userRegisteTime +
                '}';
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Blob getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(Blob userAvatar) {
        this.userAvatar = userAvatar;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Date getUserBrithday() {
        return userBrithday;
    }

    public void setUserBrithday(Date userBrithday) {
        this.userBrithday = userBrithday;
    }

    public Date getUserRegisteTime() {
        return userRegisteTime;
    }

    public void setUserRegisteTime(Date userRegisteTime) {
        this.userRegisteTime = userRegisteTime;
    }
}
