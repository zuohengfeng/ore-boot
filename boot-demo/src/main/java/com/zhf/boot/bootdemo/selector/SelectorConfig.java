package com.zhf.boot.bootdemo.selector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * @author:zuohf
 * @description:
 * @date:created in 2019/11/5
 * mofify:by
 */
@Import(DemoImportSelector.class)
public class SelectorConfig {

    @Bean
    public DemoSelectorService demoSelectorService(){
        return new DemoSelectorService();
    }
}