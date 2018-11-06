package com.example.demo.nosql;

import com.example.demo.entity.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    public void insertTest(){
        Department dept = new Department();
        dept.setId(3L);
        dept.setName("销售部");
        dept.setDescr("卖软件");
        departmentRepository.save(dept);
    }

    @Test
    public void getAllTest(){
        List<Department> departmentList = departmentRepository.findAll();
        for (Department department: departmentList) {
            System.out.println(department);
        }
    }

    @Test
    public void delTest(){
        departmentRepository.deleteById(2);
    }

}
