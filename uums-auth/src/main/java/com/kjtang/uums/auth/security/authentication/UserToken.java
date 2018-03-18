package com.kjtang.uums.auth.security.authentication;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

/**
 * Created by kaijun on 2018/3/18.
 */
public class UserToken extends AbstractAuthenticationToken {

    private Long userid;
    //用户名
    private String username;
    //用户密码
    private String password;

    public UserToken(Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
    }

    public UserToken(){
        super((Collection)null);
    }
    public UserToken(String username,String password){
        super((Collection)null);
        this.username = username;
        this.password = password;
        this.setAuthenticated(false);
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    @Override
    public Object getCredentials() {
        return this.password;
    }

    @Override
    public Object getPrincipal() {
        return this.username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
