package com.sean.house.movieservice.controller;

import com.sean.house.movieservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : sean
 * @version V1.0
 * @Project: SpringCloudDemo
 * @Package com.sean.house.moiveservice.controller
 * @Description: TODO
 * @date Date : 2021年05月13日 23:08
 */
@RestController
public class MoiveController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable long id)
    {
        //hardCode硬编码方式不可取
      return restTemplate.getForObject("http://localhost:8000/"+id,User.class);
//        return restTemplate.getForObject("http://localhost:userservice:8000/" + id,User.class);
    }
}
