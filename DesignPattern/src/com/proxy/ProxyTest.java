package com.proxy;


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
		// 绑定关系，因为挂在接口HelloWorld下，所以声明代理对象HelloWorld proxy
		HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
		// 注意，此时HelloWorld对象已经是一个代理对象，它会进入代理的逻辑方法invoke里
		proxy.sayHelloWorld();
	}
	
	public static void testCGLIBProxy() {
		System.out.println("testCGLIBProxy====================");
		CglibProxyExample cpe = new CglibProxyExample();
	    ReflectServiceImpl obj = (ReflectServiceImpl)cpe.getProxy(ReflectServiceImpl.class);
	    obj.sayHello("杨超");
	}

}
