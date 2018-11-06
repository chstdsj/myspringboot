package com.jyr.springboot.controller;

import com.jyr.springboot.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(value = "FastJson测试", tags = { "测试接口" })
@Controller
@RequestMapping("fastjson")
public class FastJsonController {

    @CrossOrigin
    @RequestMapping(value = "/test", produces = "application/json;charset=utf-8")
    @ResponseBody
    public User test() {
        User user = new User();

        user.setName("jack");
        user.setAge(20);
        user.setGender("男");
        user.setBirthday(new Date());

        // 模拟异常
        int i = 1/0;

        return user;
    }

    /**
     * 测试swagger2
     * @param name
     * @return
     */
    @ApiOperation("获取用户信息")
    @ApiImplicitParam(name = "name", value = "用户名", dataType = "string", paramType = "query")
    @GetMapping("/test/{name}")
    @ResponseBody
    public User test(@PathVariable("name") String name) {
        User user = new User();

        user.setName("jack");
        user.setAge(20);
        user.setGender("男");
        user.setBirthday(new Date());

        return user;
    }
}

