package com.lanou.annonation;


import org.springframework.context.annotation.*;

@EnableAspectJAutoProxy
//自动代理,AOP注解的方式
@Configuration
// 通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
@ComponentScan("com.lanou.*")
public class Config {
    @Bean
    public Boy getBoy(){
        return new Boy();
    }
}
