package com.example.web;

import com.example.dao.UserDao;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ApiController {

    @Autowired
    UserDao userDao;

    @PostMapping("/login")
    public User login(@RequestBody User user){
        return userDao.findByUsername(user.getUsername());
    }
}
