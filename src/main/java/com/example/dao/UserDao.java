package com.example.dao;

import java.util.List;

import com.example.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    /**
     * id 查詢
     *
     * @param id PK
     * @return obj
     */
    List<User> queryAll();

    User queryById(Integer id);

}
