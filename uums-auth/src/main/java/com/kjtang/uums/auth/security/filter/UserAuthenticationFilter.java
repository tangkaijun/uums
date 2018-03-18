package com.kjtang.uums.auth.security.filter;

import com.alibaba.fastjson.JSON;
import com.kjtang.uums.auth.security.authentication.UserToken;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Created by kaijun on 2018/3/18.
 */
public class UserAuthenticationFilter extends UsernamePasswordAuthenticationFilter {



    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        if ("GET".equalsIgnoreCase(request.getMethod())) return null;
        String username = obtainUsername(request);
        String password = obtainPassword(request);
        UserToken token = new UserToken(username,password);
        this.setDetails(request,token);
        Authentication authentication = this.getAuthenticationManager().authenticate(token);
        if(authentication.isAuthenticated()){
            return authentication;
        }
        return null;
    }

    protected void setDetails(HttpServletRequest request, UserToken token) {
        token.setDetails(this.authenticationDetailsSource.buildDetails(request));
    }
}
