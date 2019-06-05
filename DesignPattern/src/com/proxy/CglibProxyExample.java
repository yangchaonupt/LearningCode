package com.proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyExample implements MethodInterceptor {
	/**
	 * ����CGLIB�������
	 * 
	 * @param cls-- Class��
	 * @return Class���CGLIB�������
	 */
	public Object getProxy(Class cls) {
		// CGLIB enhancer��ǿ�����
		Enhancer enhancer = new Enhancer();
		// ������ǿ����
		enhancer.setSuperclass(cls);
		// ��������߼�����Ϊ��ǰ����Ҫ��ǰ����ʵ��MethodInterceptor����
		enhancer.setCallback(this);
		// ���ɲ����ش������
		return enhancer.create();
	}
	/**
	 * �����߼�����
	 * 
	 * @param proxy �������
	 * @param method ����
	 * @param args  ��������
	 * @param methodProxy ��������
	 * @return �����߼�����
	 * @throws Throwable �쳣
	 */
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.err.println("������ʵ����ǰ");
		// CGLIB���������ʵ���󷽷�
		Object result = methodProxy.invokeSuper(proxy, args);
		System.err.println("������ʵ�����");
		return result;
	}
}
