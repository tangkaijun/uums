package com.kjtang.uums.auth.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * Created by kaijun on 2018/3/18.
 */
@Configurable
@EnableResourceServer
public class OAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter{

}