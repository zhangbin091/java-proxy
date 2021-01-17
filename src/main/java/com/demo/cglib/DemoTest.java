package com.demo.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @Classname DemoTest
 * @Description TODO
 * @Date 2021/1/17 10:39
 * @Created by 张斌
 */
public class DemoTest {
    public static void main(String[] args) {
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(Target11.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new TargetInterceptor());
        // 创建代理对象
        Target11 proxy=(Target11) enhancer.create();
        // 通过代理对象调用目标方法
        proxy.process();
    }
}
