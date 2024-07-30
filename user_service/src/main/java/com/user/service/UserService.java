package com.user.service;

import com.user.entity.User;

import java.util.List;

public interface UserService {

    public User getUser(Long Id);

    public List<User> getUsers();
}
