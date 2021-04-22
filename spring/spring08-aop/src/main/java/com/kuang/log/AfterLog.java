package com.kuang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {

    //o 返回值
    //method被调用的方法
    //args 被调用的方法的对象的参数
    //o1 被调用的目标对象
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了" + o1.getClass().getName()
                +"的"+method.getName()+"方法,"
                +"返回值："+o);
    }
}
