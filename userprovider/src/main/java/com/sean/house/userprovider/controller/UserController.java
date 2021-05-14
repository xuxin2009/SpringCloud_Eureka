package com.sean.house.userprovider.controller;

import com.sean.house.userprovider.dao.UserRepository;

import com.sean.house.userprovider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : sean
 * @version V1.0
 * @Project: SpringCloudDemo
 * @Package com.sean.house.userprovider.controller
 * @Description: TODO
 * @date Date : 2021年05月13日 16:15
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * 获取用户列表
     * @return
     */
    @GetMapping("")
    public List<User> findAllUsers(){
       List<User> findOne = userRepository.findAll();
        return findOne;
    }

    @GetMapping("/{id}")
    public User findOneUser(@PathVariable Long id)
    {
        User user = userRepository.getOne(id);
        return user;
    }


}
