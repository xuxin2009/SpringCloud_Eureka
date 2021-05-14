package com.sean.house.userservice.controller;

import com.sean.house.userservice.dao.UserMapper;
import com.sean.house.userservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : sean
 * @version V1.0
 * @Project: SpringCloudDemo
 * @Package com.sean.house.userservice.controller
 * @Description: TODO
 * @date Date : 2021年05月13日 22:08
 */

@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;

    @GetMapping
    public String getUserbyID()
    {

        return "hello";
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id)
    {
        return userMapper.selectUserById(id);
    }
}
