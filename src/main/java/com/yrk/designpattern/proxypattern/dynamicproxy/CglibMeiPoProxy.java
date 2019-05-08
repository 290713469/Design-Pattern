package com.yrk.designpattern.proxypattern.dynamicproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


public class CglibMeiPoProxy implements MethodInterceptor{
	
	public Object getInstance(Class<?> clazz) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}


	private void before() {
		System.out.println("我是媒婆，以拿到需求");
		System.out.println("开始物色人选");
	}

	private void after() {
		System.out.println("物色成功");
	}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		before();
		Object o = arg3.invokeSuper(arg0, arg2);
		after();
		return o;
	}

}
