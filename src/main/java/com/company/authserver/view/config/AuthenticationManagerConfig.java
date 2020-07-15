package com.company.authserver.view.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AuthenticationManagerConfig extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        // We don't need CSRF for this example
        httpSecurity.csrf().disable()
                .authorizeRequests()
                .antMatchers("/login*").permitAll()
//                .antMatchers("/css*").permitAll()
//                .antMatchers("/fonts*").permitAll()
//                .antMatchers("/images*").permitAll()
//                .antMatchers("/js*").permitAll()
//                .antMatchers("/vendor*").permitAll()
                .antMatchers("/index.html").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/index.html")
                .defaultSuccessUrl("/auth");
    }
}
