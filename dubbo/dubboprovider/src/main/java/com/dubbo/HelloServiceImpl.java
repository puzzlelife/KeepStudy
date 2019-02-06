package com.dubbo;

public class HelloServiceImpl implements HelloService {


    public String sayHello(String name) {
        return "hello"+name;
    }
}
