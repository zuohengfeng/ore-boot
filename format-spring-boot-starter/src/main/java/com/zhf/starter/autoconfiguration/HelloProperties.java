package com.zhf.starter.autoconfiguration;


import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

//外部动态配置类  前缀为zhf.hello.format
@ConfigurationProperties(prefix=HelloProperties.HELLO_FORMAT_PREFIX)
public class HelloProperties {

    public static final String HELLO_FORMAT_PREFIX="zhf.hello.format";
    private Map<String,Object> info;

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }
}
