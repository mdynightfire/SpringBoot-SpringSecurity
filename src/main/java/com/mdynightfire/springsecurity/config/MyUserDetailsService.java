package com.mdynightfire.springsecurity.config;

import java.util.ArrayList;
import java.util.List;

import com.mdynightfire.springsecurity.Service.user.impl.UserServiceImpl;
import com.mdynightfire.springsecurity.entity.user.Role;
import com.mdynightfire.springsecurity.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author mdynightfire
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserServiceImpl userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User myUser = userService.findByUserName(username);
        if (myUser == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        // 根据用户名查找到对于的密码和权限
        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        for (Role role : myUser.getRoles()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRole());
            grantedAuthorities.add(grantedAuthority);
        }
        return new org.springframework.security.core.userdetails.User(
            myUser.getUsername(),
            myUser.getPassword(),
            grantedAuthorities);
    }
}
