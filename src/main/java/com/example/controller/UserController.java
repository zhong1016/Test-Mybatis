package com.example.controller;

import javax.annotation.Resource;

import com.example.service.UserService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("")
    public Object get(Integer id) {

        if (id == null) {
            return this.userService.queryAll();
        } else {
            return this.userService.queryById(id);
        }

    }

}
