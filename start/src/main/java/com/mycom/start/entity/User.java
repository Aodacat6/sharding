package com.mycom.start.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ：songdalin
 * @date ：2022-3-29 上午 11:27
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    private Long id;

    private String name;
}
