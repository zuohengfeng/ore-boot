package com.zhf.starter;

import com.zhf.starter.autoconfiguration.HelloProperties;
import com.zhf.starter.format.FormatProcessor;

/**
 *格式化模板方法
 */
public class HelloFormatTemplate {

    private FormatProcessor formatProcessor;

    private HelloProperties helloProperties;

    //构造器  将FormatProcessor,HelloProperties 注入
    public HelloFormatTemplate(HelloProperties helloProperties,FormatProcessor formatProcessor) {
        this.helloProperties=helloProperties;
        this.formatProcessor = formatProcessor;
    }

    public <T> String doFormat(T obj){

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("begin:Execute format").append("<br/>");
        stringBuilder.append("HelloProperties:").append(formatProcessor.format(helloProperties.getInfo())).append("<br/>");
        stringBuilder.append("Obj format result:").append(formatProcessor.format(obj)).append("<br/>");
        return stringBuilder.toString();

    }
}
