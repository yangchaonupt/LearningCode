package com.proxy;

public class DirectProxyExample implements HelloWorld {

    private HelloWorld helloWorld;

    public DirectProxyExample(final HelloWorld helloWorld){
        this.helloWorld=helloWorld;
    }

    @Override
    public void sayHelloWorld() {
        System.out.println("进入代理逻辑方法");
        System.out.println("打招呼之前的服务");
        // 相当于调用sayHelloWorld方法
        helloWorld.sayHelloWorld();
        System.out.println("打招呼之后的服务");
    }
}
