package com.example.demo.Controller;

import com.example.demo.Module.User.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userDao;


    @GetMapping("/user")
    public Object getUser() {

        return userDao.getUser("test");
    }

    @GetMapping("/users")
    public Object getUsers() {

        return userDao.getUserList();
    }

}