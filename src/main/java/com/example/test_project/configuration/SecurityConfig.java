package com.example.test_project.configuration;



import com.example.test_project.services.HosterService;
import com.example.test_project.services.userservicelmlp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private userservicelmlp userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder);
    }



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/auth/validateAccount/{userId}","/getallusers","/api/auth/signin","/validateAccount/{userId}","/api/auth/signup","/getreservation/{id}","/getallreservations","/deletereservation/{id}","/updatereservation/{id}","/addreservation","/addvisitor","/getvisitor/{id}","/getallvisitors","/deletevisitor/{id}","/updatevisitor/{id}","/addlisting","/updatelisting/{id}","/deletelisting/{id}","/getalllistings","/getlisting/{id}","/gethoster/{id}","/getallhosters","/deletehoster/{id}","/updatehoster/{id}","/addhoster","/getalladmins","/getadmin/{id}","/deleteadmin/{id}","/updateadmin/{id}","/addadmin").permitAll() // Endpoints to register/signup and signin
                .anyRequest().authenticated()
                .and().httpBasic();

    }
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }


}


