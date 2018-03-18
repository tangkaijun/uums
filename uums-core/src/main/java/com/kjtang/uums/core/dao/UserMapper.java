package com.kjtang.uums.core.dao;

import com.kjtang.uums.common.base.BaseMapper;
import com.kjtang.uums.core.entity.User;

/**
 * Created by kaijun on 2018/3/17.
 */
public interface UserMapper extends BaseMapper<User,Long> {
    /**
     * 通过账号信息获取用户信息（其中账号包括:登录名，邮箱，电话号码等）
     * @param account
     * @return
     */
     public User getUserByAccount(String account);
}