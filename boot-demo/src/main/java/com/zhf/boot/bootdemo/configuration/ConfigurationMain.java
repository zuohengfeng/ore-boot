package com.zhf.boot.bootdemo.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author:zuohf
 * @description:
 * @date:created in 2019/11/5
 * mofify:by
 */
public class ConfigurationMain {

    /**
     * @Configuration 注解
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(Config.class);
        DemoService bean = applicationContext.getBean(DemoService.class);
        System.out.println(bean);
    }
}