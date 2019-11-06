package com.zhf.boot.bootdemo.selector;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author:zuohf
 * @description:
 * @date:created in 2019/11/5
 * mofify:by
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(SelectorConfig.class);
        DemoSelectorService bean = applicationContext.getBean(DemoSelectorService.class);
        System.out.println(bean);
    }
}