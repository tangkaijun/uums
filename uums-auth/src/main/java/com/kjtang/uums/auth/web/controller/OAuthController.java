package com.kjtang.uums.auth.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kaijun on 2018/3/18.
 */
@RequestMapping("/oauth")
@Controller
public class OAuthController {

    @RequestMapping(value="/login")
    public String login(HttpServletRequest request) throws Exception{
        return "login";
    }

}
