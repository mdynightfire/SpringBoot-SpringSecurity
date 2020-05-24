package com.mdynightfire.springsecurity.Service.user;

import com.mdynightfire.springsecurity.entity.user.User;

/**
 * @author mdynightfire
 */
public interface UserService {
    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return user
     */
    User findByUserName(String username);
}
