package com.jyr.springboot.services.impl;

import com.jyr.springboot.dao.DepartmentDao;
import com.jyr.springboot.pojo.Department;
import com.jyr.springboot.services.DepartmentService;

import javax.annotation.Resource;

//@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentDao departmentMapper;

    @Override
    public void insert(Department dept) {
        departmentMapper.insert(dept);
    }
}
