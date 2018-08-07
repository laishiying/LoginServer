package com.hxyl.jason;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 链接Mysql数据库简单的集成Mybatis框架访问数据库。
 *
 * @author hmilyylimh
 *
 * @version 0.0.1
 *
 * @date 2017-10-19
 *
 */
@SpringBootApplication
@MapperScan("com.hxyl.jason.mapper.**")
@EnableEurekaClient
public class Start {


    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
        System.out.println("【【【【【【 链接MysqlMybatis数据库微服务 】】】】】】已启动.");
    }



}
