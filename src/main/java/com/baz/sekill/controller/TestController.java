package com.baz.sekill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/hello")
    public Object test(){
        return "register-login";
    }

    @RequestMapping("/show")
    public Object show(){
        return "goods";
    }

}
