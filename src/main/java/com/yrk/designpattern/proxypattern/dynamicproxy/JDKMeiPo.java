/**
 * 
 */
package com.yrk.designpattern.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author runkaiyang
 *
 */
public class JDKMeiPo implements InvocationHandler {
	
	private Object target;
	
	public Object getInstance(Object obj) {
		this.target = obj;
		Class<?> clazz = this.target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object result = method.invoke(this.target, args);
		after();
		return result;
	}

	private void after() {
		System.out.println("�ҵ����ʶ���");
	}

	private void before() {
		System.out.println("����ý�ţ��õ�����");
		System.out.println("��ʼ��ɫ");
	}

}
