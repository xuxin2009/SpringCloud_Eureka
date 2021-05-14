package com.sean.house.userservice;

import com.netflix.discovery.converters.Auto;
import com.sean.house.userservice.dao.UserMapper;
import com.sean.house.userservice.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserserviceApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testSelect()
    {
        User user = userMapper.selectUserById(1L);
        System.out.println(user.toString());
    }

    @Test
    void testSelectBy()
    {
       List<User> userList = userMapper.selectList(null);
        System.out.println(userList.size());
    }

}
