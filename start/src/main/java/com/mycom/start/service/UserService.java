package com.mycom.start.service;

import com.mycom.start.entity.User;

import java.util.List;

/**
 * @author ：songdalin
 * @date ：2022-3-29 下午 01:53
 * @description：
 * @modified By：
 * @version: 1.0
 */
public interface UserService {

    List<User> findAll();

    User findById(Long id);
}
