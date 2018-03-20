package com.kjtang.uums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class AuthApplication {

    public static void main( String[] args ) {
        SpringApplication.run(AuthApplication.class,args);
    }

}