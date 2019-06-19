package com.baz.sekill.controller;

import com.baz.sekill.model.SkUser;
import com.baz.sekill.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户注册
     * @param skUser
     * @return
     */
    @ResponseBody
    @RequestMapping("/register")
    public Object register(SkUser skUser){
        skUser.setCreat_time(new Date());
        skUser.setLast_login(new Date());
        skUser.setUpdate_time(new Date());
        int num = userService.register(skUser);
        if (num > 0){
            return num;
        }
        return null;
    }

    /**
     * 用户登录
     * @param skUser
     * @return
     */
    @ResponseBody
    @RequestMapping("/login")
    public Object login(SkUser skUser){
        skUser.setCreat_time(new Date());
        skUser.setLast_login(new Date());
        skUser.setUpdate_time(new Date());
        SkUser user = userService.login(skUser);

        if (user == null){
            return user;
        }
        return null;
    }

}
