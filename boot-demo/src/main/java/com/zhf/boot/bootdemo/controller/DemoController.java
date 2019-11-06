package com.zhf.boot.bootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:zuohf
 * @description:
 * @date:created in 2019/11/5
 * mofify:by
 */
@RestController
public class DemoController {

    @GetMapping("demo")
    public String demo(){
        return "hello zhf";
    }
}