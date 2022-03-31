package com.mycom.start.repository;

import com.mycom.start.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ：songdalin
 * @date ：2022-3-29 下午 01:51
 * @description：
 * @modified By：
 * @version: 1.0
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
