package com.lanou.annonation;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    @Pointcut("bean(boy)")
    public void coding(){
        System.out.println("编码!");
    }
}
