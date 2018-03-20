package com.example.demo.Module.User;


import com.example.demo.Model.User;

import java.util.List;

public interface UserMapper {

    public User getUser(String username);
    public List<User> getUserList();

}
