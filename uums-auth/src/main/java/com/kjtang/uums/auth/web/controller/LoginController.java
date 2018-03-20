package com.kjtang.uums.auth.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by kaijun on 2018/3/18.
 */
@Controller
public class LoginController {

    @RequestMapping(value="/toLogin")
    public void login(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String queryString = request.getQueryString();
        response.sendRedirect("/login.html?"+queryString);
    }

    @RequestMapping(value="/authorize")
    public String auth(HttpServletRequest request) throws Exception{
        return "authorize";
    }

}
