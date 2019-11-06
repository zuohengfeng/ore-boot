package com.zhf.starter.autoconfiguration;


import com.zhf.starter.HelloFormatTemplate;
import com.zhf.starter.format.FormatProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(FormatAutoConfiguration.class)//导入FormatAutoConfiguration的配置类
@EnableConfigurationProperties(HelloProperties.class)//初始化外部配置HelloProperties.class
@Configuration//初始化本配置
public class HelloAutoConfiguration {

    @Bean
    public HelloFormatTemplate helloFormatTemplate(HelloProperties helloProperties,FormatProcessor formatProcessor){
        return new HelloFormatTemplate(helloProperties,formatProcessor);
    }
}
