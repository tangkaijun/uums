package com.kjtang.uums.core.service;

import com.kjtang.uums.common.base.BaseService;
import com.kjtang.uums.core.entity.User;

/**
 * Created by kaijun on 2018/3/17.
 */
public interface UserService extends BaseService<User,Long> {

    public User getUserByAccount(String account);
}