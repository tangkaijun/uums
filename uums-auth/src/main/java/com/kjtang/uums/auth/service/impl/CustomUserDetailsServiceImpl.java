package com.kjtang.uums.auth.service.impl;

import com.kjtang.uums.core.entity.User;
import com.kjtang.uums.core.service.UserService;
import com.kjtang.uums.auth.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.authentication.CachingUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * Created by kaijun on 2018/3/18.
 */
@Component
public class CustomUserDetailsServiceImpl  implements CustomUserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //User user = userService.getUserByAccount(username);
        org.springframework.security.core.userdetails.User user = new org.springframework.security.core.userdetails.User("admin","123456",null);
        return user;
    }

}
