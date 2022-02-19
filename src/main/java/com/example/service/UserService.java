package com.example.service;

import java.util.List;

import com.example.entity.User;

public interface UserService {

    /**
     * id 查詢
     *
     * @param id PK
     * @return obj
     */
    List<User> queryAll();

    User queryById(Integer id);

}
