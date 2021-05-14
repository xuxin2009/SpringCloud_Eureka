package com.sean.house.userprovider;

import com.sean.house.userprovider.dao.UserRepository;
import com.sean.house.userprovider.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserproviderApplicationTests {

    @Resource
    private UserRepository userRepository;
    @Test
    void contextLoads() {
    }

    @Test
    void  getOneUser()
    {
        User user = userRepository.getOne(1L);
        System.out.println(user.toString());
    }

}
