package com.xy2h.dto;

/**
 * @Author lzr
 * @Version 1.0.0
 * @Date 2017/2/14
 * @Description 所有Ajax请求返回类型，封装Json结果
 */
public class RegisterResult{

    private int registerStatus;
    private String msg;

    public RegisterResult() {
    }

    public RegisterResult(int registerStatus, String msg) {
        this.registerStatus = registerStatus;
        this.msg = msg;
    }

    public int gerRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(int registerStatus) {
        this.registerStatus = registerStatus;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
