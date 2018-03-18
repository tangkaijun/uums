package com.kjtang.uums.core.service.impl;

import com.kjtang.uums.common.base.AbstractService;
import com.kjtang.uums.core.dao.UserMapper;
import com.kjtang.uums.core.entity.User;
import com.kjtang.uums.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

/**
 * Created by kaijun on 2018/3/17.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User,Long> implements UserService{

    @Autowired
    private UserMapper userMapper;

    @PostConstruct
    public void init(){
        this.setBaseMapper(userMapper);
    }

    @Override
    public void add(User entity) {
        userMapper.insert(entity);
    }

    @Override
    public User getUserByAccount(String account) {
        User user = userMapper.getUserByAccount(account);
        return user;
    }
}
