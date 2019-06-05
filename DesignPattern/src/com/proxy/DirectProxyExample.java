package com.proxy;

public class DirectProxyExample implements HelloWorld {

    private HelloWorld helloWorld;

    public DirectProxyExample(final HelloWorld helloWorld){
        this.helloWorld=helloWorld;
    }

    @Override
    public void sayHelloWorld() {
        System.out.println("��������߼�����");
        System.out.println("���к�֮ǰ�ķ���");
        // �൱�ڵ���sayHelloWorld����
        helloWorld.sayHelloWorld();
        System.out.println("���к�֮��ķ���");
    }
}
