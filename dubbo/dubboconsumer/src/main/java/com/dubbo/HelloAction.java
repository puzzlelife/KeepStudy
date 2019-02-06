package com.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloAction {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
        context.start();
        System.out.println("consumer start");
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println("consumer");
        System.out.println(helloService.sayHello("wy"));
    }
}
