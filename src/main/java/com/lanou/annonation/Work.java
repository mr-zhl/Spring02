package com.lanou.annonation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class Work {
    @Pointcut("bean(boy)")
    //@Pointcut("execution(* *coding())")
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

    /**
     * @Around
     * 返回值方法为Object
     * 方法参数为ProceedingJoinPoint
     */
    @Around("abc()")
    public Object printTime3(ProceedingJoinPoint joinPoint){
        //方法前执行
        System.out.println(new Date());
        Object o =null;
        try {
            //调用方法
          o = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        //方法后执行
        System.out.println(new Date());
        return o;

    }
}
