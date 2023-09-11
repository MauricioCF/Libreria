// package com.example.libreria.config;

// import org.apache.logging.log4j.LogManager;
// import org.apache.logging.log4j.Logger;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.http.HttpMethod;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


// @Configuration
// @EnableWebSecurity
// public class SecurityConfig extends WebSecurityConfigurerAdapter {

//     private static final Logger LOG = LogManager.getLogger(WebSecurityConfigurerAdapter.class);
    
//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http
//                 .csrf().disable()
//                 .authorizeRequests()
//                 .antMatchers(HttpMethod.POST,
//                 "/clientes/*",
//                 "/libro/**",
//                 "/transacciones/**"
//                 ).authenticated()
//                 .antMatchers(HttpMethod.GET,
//                 "/clientes/*",
//                 "/libro/**",
//                 "/transacciones/**"
//                 ).authenticated()
//                 .and()
//                 .httpBasic();
//     }

//     @Bean
//     public BCryptPasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }
    
// }