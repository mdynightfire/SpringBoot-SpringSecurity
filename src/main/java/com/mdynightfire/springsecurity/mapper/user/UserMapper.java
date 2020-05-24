package com.mdynightfire.springsecurity.mapper.user;

import com.mdynightfire.springsecurity.entity.user.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author mdynightfire
 */
public interface UserMapper extends Mapper<User> {
    User selectByUserName(String username);
}