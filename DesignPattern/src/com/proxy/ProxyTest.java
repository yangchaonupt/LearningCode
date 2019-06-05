package com.proxy;

import com.lean.ssm.chapter2.reflect.ReflectServiceImpl;

public class ProxyTest {

	public static void main(String[] args) {
		testDirectProxy();
		testJdkProxy();
		testCGLIBProxy();
	}

	public static void testDirectProxy() {
		System.out.println("testDirectProxy====================");
		HelloWorld helloWorld = new HelloWorldImpl();
		helloWorld.sayHelloWorld();
		DirectProxyExample directProxyExample = new DirectProxyExample(helloWorld);
		directProxyExample.sayHelloWorld();


	}

	public static void testJdkProxy() {
		System.out.println("testJdkProxy====================");
		JdkProxyExample jdk = new JdkProxyExample();
		// �󶨹�ϵ����Ϊ���ڽӿ�HelloWorld�£����������������HelloWorld proxy
		HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
		// ע�⣬��ʱHelloWorld�����Ѿ���һ���������������������߼�����invoke��
		proxy.sayHelloWorld();
	}
	
	public static void testCGLIBProxy() {
		System.out.println("testCGLIBProxy====================");
		CglibProxyExample cpe = new CglibProxyExample();
	    ReflectServiceImpl obj = (ReflectServiceImpl)cpe.getProxy(ReflectServiceImpl.class);
	    obj.sayHello("�");
	}

}
