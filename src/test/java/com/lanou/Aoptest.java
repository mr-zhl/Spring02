package com.lanou;

import com.lanou.annonation.Boy;
import com.lanou.annonation.Config;
import com.lanou.annonation.Work;
import com.lanou.aop.Girl;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

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
        //System.out.println(boy);
    }

    @Test
    void test3() {
        //通过Java配置来实例化Config容器
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Boy boy = (Boy) context.getBean("boy");
        boy.coding();

    }
}
