package com.jyr.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {

    @RequestMapping("hello")
    public String hello(Map<String,Object> map) {
        map.put("msg", "Hello Thymeleaf");
        return "hello";
    }

    @RequestMapping("websocket")
    public String websocket(Map<String,Object> map) {
        //map.put("msg", "Hello Thymeleaf");
        return "websocket";
    }
}
