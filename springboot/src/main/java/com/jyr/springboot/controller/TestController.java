package com.jyr.springboot.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static Logger logger = LogManager.getLogger(TestController.class);

    @RequestMapping("/home")
    @ResponseBody
    public String home(){
        System.out.println("我的第一个springboot应用");
        logger.debug("home");
        return "Hello world";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        System.out.println("登录2222255555");
        logger.info("login");
        return "login";
    }

    @RequestMapping("/logout")
    @ResponseBody
    public String logout(){
        System.out.println("登出");
        logger.warn("logout");
        return "logout";
    }
}
