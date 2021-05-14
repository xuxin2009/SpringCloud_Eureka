package com.sean.house.userprovider.dao;

import com.sean.house.userprovider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : sean
 * @version V1.0
 * @Project: SpringCloudDemo
 * @Package com.sean.house.userprovider.dao
 * @Description: TODO
 * @date Date : 2021年05月13日 16:14
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
