package com.mycom.start.service.impl;

import com.mycom.start.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ：songdalin
 * @date ：2022-3-29 下午 02:50
 * @description：
 * @modified By：
 * @version: 1.0
 */
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    void findAll() {
        System.out.println(userService.findAll());
    }

    @Transactional(readOnly = true)
    @Test
    void findById() {
        Long id = 1L;
        System.out.println(userService.findById(id));
    }
}