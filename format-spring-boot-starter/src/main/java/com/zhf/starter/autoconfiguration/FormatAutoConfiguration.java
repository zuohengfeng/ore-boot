package com.zhf.starter.autoconfiguration;


import com.zhf.starter.format.FormatProcessor;
import com.zhf.starter.format.JsonFormatProcessor;
import com.zhf.starter.format.StringFormatProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class FormatAutoConfiguration {


    //当前项目没有com.alibaba.fastjson.JSON 类时进行bean的注入
    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    @Bean
    @Primary
    public FormatProcessor stringFormat(){
        return new StringFormatProcessor();
    }

    //当前项目有com.alibaba.fastjson.JSON 类时进行bean的注入
    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    @Bean
    public FormatProcessor jsonFormat(){
        return new JsonFormatProcessor();
    }

}
