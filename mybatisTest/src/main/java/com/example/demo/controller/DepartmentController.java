package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.services.DepartmentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("department")
@ResponseBody
public class DepartmentController {

    @Resource
    private DepartmentService departmentService;

    @RequestMapping("save")
    public Map<String,Object> save(Department department) {
        this.departmentService.save(department);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code", "200");
        map.put("msg", "保存成功");
        return map;
    }

    @RequestMapping("get/{id}")
    public Map<String,Object> get(@PathVariable("id") Long id) {
        Department department = this.departmentService.getDepartmentById(id);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code", "200");
        map.put("msg", "获取成功");
        map.put("data", department);
        return map;
    }

    @RequestMapping("update")
    public Map<String,Object> update(Department department) {
        this.departmentService.update(department);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code", "200");
        map.put("msg", "修改成功");
        return map;
    }

    @RequestMapping("delete/{id}")
    public Map<String,Object> delete(@PathVariable("id") Long id) {
        this.departmentService.delete(id);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code", "200");
        map.put("msg", "删除成功");
        return map;
    }
}
