package com.sean.house.userservice.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sean.house.userservice.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : sean
 * @version V1.0
 * @Project: SpringCloudDemo
 * @Package com.sean.house.userservice.dao
 * @Description: TODO
 * @date Date : 2021年05月13日 21:50
 */

public interface UserMapper extends BaseMapper<User> {

    /**
     * gdd
     * @return
     */
    User selectUserById(Long id);
}
