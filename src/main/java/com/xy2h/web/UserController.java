package com.xy2h.web;

import com.xy2h.dto.RegisterResult;
import com.xy2h.entity.User;
import com.xy2h.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author lzr
 * @Version 1.0.0
 * @Date 2017/2/14
 * @Description
 */
@Controller
@RequestMapping("/xy2h")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    //Ajax,Json
    @RequestMapping(value = "/user/signup", method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    //springMVC看到@ResponseBody,会把结果封装成Json
    @ResponseBody
    public RegisterResult getRegisterStatus(User user) {
        RegisterResult registerResult;
        int insertCouunt = userService.insertUser(user);
        if (insertCouunt > 0) {
            registerResult = new RegisterResult(1, "用户注册成功！");
        }else {
            registerResult = new RegisterResult(0, "用户注册失败！");
        }
        return registerResult ;
    }
}
