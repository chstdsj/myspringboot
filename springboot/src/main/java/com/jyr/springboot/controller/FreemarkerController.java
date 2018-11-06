package com.jyr.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("freemarker")
public class FreemarkerController {

    @RequestMapping("home")
    public String hello(Map<String,Object> map) {
        map.put("msg", "Hello Freemarker");
        System.out.println("freemarker/home");

        // 模拟异常
        //int i = 1/0;

        return "hello";
    }
}
