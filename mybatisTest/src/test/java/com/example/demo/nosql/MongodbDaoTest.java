package com.example.demo.nosql;

import com.example.demo.entity.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodbDaoTest {

    @Autowired
    private MongodbDao mongodbDao;

    @Test
    public void testSet() {
        Department dept = new Department();
        dept.setId(2L);
        dept.setName("销售部");
        dept.setDescr("卖软件");

        this.mongodbDao.insert(dept);

    }

    @Test
    public void testGet() {
        Department dept = this.mongodbDao.getById(1);
        System.out.println(dept);
    }

    @Test
    public void testDelete() {
        this.mongodbDao.deleteById(1);
    }
}
