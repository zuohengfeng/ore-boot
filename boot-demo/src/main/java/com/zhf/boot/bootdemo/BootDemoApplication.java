package com.zhf.boot.bootdemo;

import com.zhf.boot.bootdemo.enableautoconfigration.Main;
import com.zhf.boot.say.SayDemo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigServletWebServerApplicationContext(Main.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        SayDemo bean = applicationContext.getBean(SayDemo.class);
        bean.sayHello();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
