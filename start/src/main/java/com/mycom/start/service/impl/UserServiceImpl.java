package com.mycom.start.service.impl;

import com.mycom.start.entity.User;
import com.mycom.start.repository.UserRepository;
import com.mycom.start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：songdalin
 * @date ：2022-3-29 下午 01:53
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.getById(id);
    }
}
