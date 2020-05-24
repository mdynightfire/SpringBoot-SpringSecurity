package com.mdynightfire.springsecurity.Service.user.impl;

import com.mdynightfire.springsecurity.Service.user.UserService;
import com.mdynightfire.springsecurity.entity.user.User;
import com.mdynightfire.springsecurity.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mdynightfire
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUserName(String username) {
        return userMapper.selectByUserName(username);
    }
}
