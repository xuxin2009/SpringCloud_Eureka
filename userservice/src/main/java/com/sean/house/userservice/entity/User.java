package com.sean.house.userservice.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author : sean
 * @version V1.0
 * @Project: SpringCloudDemo
 * @Package com.sean.house.userservice.entity
 * @Description: TODO
 * @date Date : 2021年05月13日 21:33
 */

@Data
public class User {

    private long id;

    private String userName;

    private String name;

    private int age;

    private BigDecimal balance;


}
