package com.zhf.example.springbootstarterdemo;

import com.zhf.starter.HelloFormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormatController {

    @Autowired//enable自动装配,根据当前环境注入bean
    HelloFormatTemplate helloFormatTemplate;

    @GetMapping("/format")
    public String format(){
        User user=new User();
        user.setAge(18);
        user.setName("zhf");
        return helloFormatTemplate.doFormat(user);
    }
}
