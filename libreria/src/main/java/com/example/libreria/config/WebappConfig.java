// package com.example.libreria.config;

// import org.springframework.boot.web.servlet.FilterRegistrationBean;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


// @Configuration
// public class WebappConfig implements WebMvcConfigurer {

//     private final class WebMvcConfigurerAdapterExtension extends WebMvcConfigurerAdapter {
//         @Override
//         public void addCorsMappings(CorsRegistry registry) {
//             registry
//                     .addMapping("/**")
//                     .allowedOrigins("*")
//                     .allowedMethods("POST", "GET", "PUT", "DELETE", "HEAD", "OPTIONS")
//                     .allowCredentials(true)
//                     .allowedHeaders(
//                             "Origin",
//                             "Accept",
//                             "x-auth-token",
//                             "Authorization",
//                             "Content-Type",
//                             "Access-Control-Request-Method",
//                             "Access-Control-Request-Headers"
//                     );
//         }
//     }

//     @Bean
//     public WebMvcConfigurer corsConfigurer() {
//         return new WebMvcConfigurerAdapterExtension();
//     }

//     @Bean
//     public FilterRegistrationBean<LoggingRequestFilter> loggingFilter() {
//         FilterRegistrationBean<LoggingRequestFilter> registrationBean
//                 = new FilterRegistrationBean();

//         registrationBean.setFilter(new LoggingRequestFilter());
//         registrationBean.addUrlPatterns(
//                 "/clientes/*",
//                 "/libro/**",
//                 "/transacciones/**"
//         );
//         return registrationBean;
//     }
// }
