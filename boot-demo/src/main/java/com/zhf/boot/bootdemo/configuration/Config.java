package com.zhf.boot.bootdemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:zuohf
 * @description:
 * @date:created in 2019/11/5
 * mofify:by
 */
@Configuration
public class Config {

    @Bean
    public DemoService demoService(){
        return new DemoService();
    }
}