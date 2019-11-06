package com.zhf.starter.format;

/**
 * 格式化处理器
 */
public interface FormatProcessor {

    //定义一个格式化的方法
    <T> String format(T obj);
}
