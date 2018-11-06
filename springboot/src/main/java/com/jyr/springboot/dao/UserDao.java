package com.jyr.springboot.dao;

import com.jyr.springboot.pojo.User;

public interface UserDao {

    public int insert(User user);

    public int deleteById(Long id);

    public int update(User user);

    public User getById(Long  id);
}
