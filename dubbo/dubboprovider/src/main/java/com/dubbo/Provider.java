package com.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dubbo-provider.xml");
        context.start();
        System.in.read();
    }
}
