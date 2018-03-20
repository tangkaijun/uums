package com.kjtang.uums.auth.config;

import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * Created by kjtang on 2018/3/20 0020.
 */
public class CustomObjectPostProcessor implements ObjectPostProcessor<Object> {

    @Override
    public <O extends Object> O postProcess(O object) {
        if(object instanceof LoginUrlAuthenticationEntryPoint){
            LoginUrlAuthenticationEntryPoint loginUrlAuthenticationEntryPoint=(LoginUrlAuthenticationEntryPoint)object;
            loginUrlAuthenticationEntryPoint.setUseForward(true);
        }
        return object;
    }
}
