package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> list = List.of(
            new User(1311L,"Hrishi", "8888888"),
            new User(1312L,"Ravi", "88884444"),
            new User(1313L,"Modi", "88777777")
    );
    @Override
    public User getUser(Long Id) {
        return list.stream().filter(user -> user.getId().equals(Id)).findAny().orElse(null);
    }

    @Override
    public List<User> getUsers() {
        return list;
    }

}
