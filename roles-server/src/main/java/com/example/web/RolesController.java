package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RolesController {

    @Autowired
    private StringRedisTemplate template;

    @GetMapping("{username}")
    public String roles(@PathVariable("username") String username) {
        return template.opsForValue().get(username);
    }

    @PostMapping("{username}/{roles}")
    public String save(@PathVariable("roles")String roles,@PathVariable("username")String username){
        template.opsForValue().set(username,roles);
        return "ok";
    }

}
