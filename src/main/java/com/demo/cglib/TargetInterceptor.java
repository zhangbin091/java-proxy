package com.demo.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Classname TargetInterceptor
 * @Description TODO
 * @Date 2021/1/17 10:34
 * @Created by 张斌
 */
public class TargetInterceptor implements MethodInterceptor {
    /**
     * o：cglib生成的代理对象
     * method：被代理对象方法
     * objects：方法入参
     * methodProxy: 代理方法
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始处理任务");
        Object object = methodProxy.invokeSuper(o,objects);
        System.out.println("结束处理任务");
        return object;
    }
}
