package com.zhf.example.springbootstarterdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcController {


    @Autowired
    JdbcTemplate db1JdbcTemplate;

    @Autowired
    JdbcTemplate db2JdbcTemplate;

    @GetMapping("/db1")
    public void insertUserInfo1(){
        System.out.println(db1JdbcTemplate.getClass()+"jdbcTemplate:"+db1JdbcTemplate);
        db1JdbcTemplate.execute("insert into user_info(name,age)values('zhf',18)");
        insertUserInfo2();
    }

    @GetMapping("/db2")
    public void insertUserInfo2(){
        System.out.println(db2JdbcTemplate.getClass()+"jdbcTemplate:"+db2JdbcTemplate);
        db2JdbcTemplate.execute("insert into user_info(name,age)values('zhf',18)");
    }
}
