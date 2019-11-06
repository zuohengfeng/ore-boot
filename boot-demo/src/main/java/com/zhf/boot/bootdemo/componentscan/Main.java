package com.zhf.boot.bootdemo.componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author:zuohf
 * @description:
 * @date:created in 2019/11/5
 * mofify:by
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(ConfigComponen.class);
        ComponenDemoService bean = applicationContext.getBean(ComponenDemoService.class);
        System.out.println(bean);
    }
}