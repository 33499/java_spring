package com.ysx.config;

import com.ysx.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//这个类被spring容器托管，注入到容器中
//这是一个配置类，和beans.xml一样
@Configuration
@Import(ysxConfig2.class)//合并配置
@ComponentScan("com.ysx.pojo")
public class ysx {
    //注册一个bean，就相当于之前的一个bean标签
    //这个方法的名字，就相当于bean标签中的id属性
    //这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User();//返回要注入到bean的对象
    }
}
