package com.zhf.boot.bootdemo.enableautoconfigration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * @author:zuohf
 * @description:
 * @date:created in 2019/11/5
 * mofify:by
 */
@EnableAutoConfiguration
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigServletWebServerApplicationContext(Main.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}