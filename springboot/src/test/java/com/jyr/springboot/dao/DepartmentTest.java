package com.jyr.springboot.dao;

import com.jyr.springboot.pojo.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentTest {

    @Resource
    private DepartmentDao departmentMapper;

    @Test
    public void testInsert() {
        Department department = new Department();
        department.setId(5L);
        department.setName("研发部");
        department.setDescr("开发产品");
        this.departmentMapper.insert(department);
    }

    @Test
    public void testGetById() {
        Department department = this.departmentMapper.getById(4L);
        System.out.println(department);
    }

    @Test
    public void testUpdate() {
        Department department = new Department();
        department.setId(5L);
        department.setDescr("开发高级产品");
        this.departmentMapper.update(department);
    }

    @Test
    public void testDeleteById() {
        this.departmentMapper.deleteById(1L);
    }
}
