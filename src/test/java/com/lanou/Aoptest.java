package com.lanou;

import com.lanou.annonation.Boy;
import com.lanou.aop.Girl;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aoptest {
    @Test
    void test1() {
        //xml配置Spring容器


        //通过xml初始化容器
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        Girl girl = (Girl) context.getBean("girl");
       girl.shopping();
    }

    @Test
    void test2() {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-context1.xml");

        Boy boy = (Boy) context.getBean("boy");
        boy.coding();
    }
}
