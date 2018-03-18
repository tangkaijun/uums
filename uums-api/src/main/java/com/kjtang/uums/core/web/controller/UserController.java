package com.kjtang.uums.core.web.controller;

import com.kjtang.uums.common.base.BaseController;
import com.kjtang.uums.common.response.ResponseVO;
import com.kjtang.uums.core.entity.User;
import com.kjtang.uums.core.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kaijun on 2018/3/17.
 */
@Api("用户管理模块接口")
@RestController
@RequestMapping("/api/user")
public class UserController extends BaseController<User,Long> {

    public UserController(){
        System.out.println("创建了UserController...............................");
    }

    @Autowired
    private UserService userService;

    @ApiOperation("新增用户信息")
    @RequestMapping(value="/add",method = RequestMethod.POST)
    @Override
    public ResponseVO<User> add(@RequestBody User entity) {
        ResponseVO<User> responseVO = new ResponseVO<>();
        userService.add(entity);
        return responseVO;
    }

    @ApiOperation("更新用户信息")
    @RequestMapping(value="/update",method = RequestMethod.POST)
    @Override
    public ResponseVO<User> update(@RequestBody User entity) {
        return null;
    }

    @ApiOperation("删除用户信息")
    @RequestMapping(value="/delete",method = RequestMethod.POST)
    @Override
    public ResponseVO<User> delete(@RequestBody User entity) {
        return null;
    }

    @ApiOperation("通过用户Id获取用户信息")
    @RequestMapping(value="/getById/{id}",method = RequestMethod.GET)
    @Override
    public User getById(@PathVariable("id") Long id) {
        return null;
    }
}
