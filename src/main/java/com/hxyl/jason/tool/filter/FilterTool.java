package com.hxyl.jason.tool.filter;

import com.hxyl.jason.tool.token20180719.JwtFilter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
public class FilterTool {
    @Bean
    public FilterRegistrationBean jwtFilter() {
        FilterRegistrationBean rbean = new FilterRegistrationBean();
        rbean.setFilter(new JwtFilter());
        rbean.addUrlPatterns("/user/*");// 过滤user下的链接
        return rbean;
    }

//
//
//    @Bean
//    public FilterRegistrationBean corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.addAllowedOrigin("*");
//        config.addAllowedHeader("*");
//        config.addAllowedMethod("OPTION");
//        config.addAllowedMethod("GET");
//        config.addAllowedMethod("POST");
//        config.addAllowedMethod("PUT");
//        config.addAllowedMethod("HEAD");
//        config.addAllowedMethod("DELETE");
//        source.registerCorsConfiguration("/**", config);
//        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter());
//        bean.setOrder(0);
//        return bean;
//    }
//
//    @Bean
//    public WebMvcConfigurer mvcConfigurer() {
//        return new WebMvcConfigurerAdapter() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**").allowedMethods("GET", "PUT", "POST", "GET", "OPTIONS");
//            }
//        };
//    }
}
