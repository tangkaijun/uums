package com.kjtang.uums.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by kaijun on 2018/3/21.
 */
@EnableOAuth2Sso
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests();
        http.antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/", "/login/**")
                .permitAll()
                .anyRequest()
                .authenticated();
    }


}
