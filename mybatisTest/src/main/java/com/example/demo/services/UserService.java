package com.example.demo.services;

import com.example.demo.entity.User;

public interface UserService {
    public User getUserById(Long userId);

    boolean addUser(User record);
}
