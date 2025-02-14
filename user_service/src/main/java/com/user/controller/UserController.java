package com.user.controller;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long id){
        User user = userService.getUser(id);
        if(user==null) return null;
        List<Contact> contacts = restTemplate.getForObject("http://contact-service/contact/user/"+id,List.class);

        user.setContacts(contacts);

        return user;
    }

    @RequestMapping("/")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
