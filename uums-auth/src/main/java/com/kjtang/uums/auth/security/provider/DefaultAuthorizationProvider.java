package com.kjtang.uums.auth.security.provider;

import com.kjtang.uums.auth.security.authentication.UserToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * Created by kaijun on 2018/3/18.
 */
@Component
public class DefaultAuthorizationProvider implements AuthenticationProvider {

    private static final Logger log = LoggerFactory.getLogger(DefaultAuthorizationProvider.class);

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UserToken token = new UserToken();
        token.setUsername((String)authentication.getPrincipal());
        token.setAuthenticated(true);
        return token;
    }

    @Override
    public boolean supports(Class<?> token) {
        return  token.equals(UserToken.class);
    }
}
