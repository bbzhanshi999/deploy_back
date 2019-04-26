package com.example.dao;

import com.example.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {

    User findByUsername(String username);
}
