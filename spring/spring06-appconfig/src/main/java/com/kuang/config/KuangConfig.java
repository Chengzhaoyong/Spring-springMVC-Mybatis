package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.kuang.pojo")
public class KuangConfig {

    @Bean
    public User getUser1(){
        return new User();
    }

}
