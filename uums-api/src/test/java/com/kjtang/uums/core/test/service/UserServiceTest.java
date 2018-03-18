package com.kjtang.uums.core.test.service;

import com.kjtang.uums.core.entity.User;
import com.kjtang.uums.core.service.UserService;
import com.kjtang.uums.UUMSApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by kaijun on 2018/3/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UUMSApplication.class)
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void testInsert(){
            User user = new User();
            user.setUsername("admin");
            user.setPassword("123456");
            user.setGender(0);
            user.setEmail("12222@qq.com");
            user.setPhone("19182727773");
            userService.add(user);
    }



}
