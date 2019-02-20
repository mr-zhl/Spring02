package com.lanou.annonation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Work {
    @Pointcut("bean(boy)||bean(girl)")
    public void abc() {
    }

    @Before("abc()")
    public void printTime1() {
        //打印当前时间
        System.out.println(System.currentTimeMillis());
    }

    @After("abc()")
    public void printTime2() {
        //打印当前时间
        System.out.println(System.currentTimeMillis());
    }
}
