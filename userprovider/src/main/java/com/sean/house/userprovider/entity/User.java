package com.sean.house.userprovider.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.math.BigInteger;

/**
 * @author : sean
 * @version V1.0
 * @Project: SpringCloudDemo
 * @Package com.sean.house.userprovider.entity
 * @Description: TODO
 * @date Date : 2021年05月13日 15:57
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    @Column
    private String userName;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private BigInteger balance;

}
