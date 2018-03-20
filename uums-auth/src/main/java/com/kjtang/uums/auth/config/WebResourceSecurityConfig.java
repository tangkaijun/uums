package com.kjtang.uums.auth.config;

import com.kjtang.uums.auth.security.filter.UserAuthenticationFilter;
import com.kjtang.uums.auth.security.provider.DefaultAuthorizationProvider;
import com.kjtang.uums.auth.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.authentication.CachingUserDetailsService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * Created by kaijun on 2018/3/18.
 */
@Configuration
public class WebResourceSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DefaultAuthorizationProvider authenticationProvider;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        // @formatter:off
        //http.logout().logoutSuccessUrl("/").and().authorizeRequests().anyRequest()
               // .authenticated().and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
        http.addFilterBefore(userAuthenticationFilter(),UsernamePasswordAuthenticationFilter.class);
        http.formLogin().loginPage("/oauth/login").permitAll().and().requestMatchers()
                .antMatchers( "/oauth/login","/oauth/authorize", "/oauth/confirm_access").and().authorizeRequests()
                .anyRequest().authenticated();
        // @formatter:on
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider);
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
        auth.eraseCredentials(false);
    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("oauth/login","/login","/userInfo.xhtml");
    }

    @Bean
    public UserAuthenticationFilter userAuthenticationFilter() throws Exception{
        UserAuthenticationFilter authenticationFilter = new UserAuthenticationFilter();
        authenticationFilter.setPostOnly(true);
        authenticationFilter.setAuthenticationManager(super.authenticationManagerBean());
        authenticationFilter.setUsernameParameter("username");
        authenticationFilter.setPasswordParameter("password");
        authenticationFilter.setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher( "/login","POST"));
        return authenticationFilter;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
