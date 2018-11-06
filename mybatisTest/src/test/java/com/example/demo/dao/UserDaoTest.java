package com.example.demo.dao;

import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void insertTest(){
        User user = new User();
        user.setName("hllo5");
        user.setAge(102);
        user.setBirthday(new Date());
        userDao.insert(user);
    }

    @Test
    public void getUserTest(){
        User user = userDao.selectByPrimaryKey(2L);
        System.out.println(user.getName());
    }

}
