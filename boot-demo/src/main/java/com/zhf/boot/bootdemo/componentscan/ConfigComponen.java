package com.zhf.boot.bootdemo.componentscan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author:zuohf
 * @description:
 * @date:created in 2019/11/5
 * mofify:by
 */
@ComponentScan
public class ConfigComponen {

    @Bean
    public ComponenDemoService componenDemoService(){
        return new ComponenDemoService();
    }
}