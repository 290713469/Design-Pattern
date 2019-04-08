/**
 * 
 */
package com.yrk.designpattern.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.yrk.designpattern.proxypattern.common.DynamicDataSourceEntry;

/**
 * @author runkaiyang
 *
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
	
	private Object target;
	
	public Object getInstance(Object obj) {
		this.target = obj;
		Class<?> clazz = this.target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before(args[0]);
		Object obj = method.invoke(this.target, args);
		after();
		return obj;
	}

	private void before(Object object) {
		try {
			
			System.out.println("proxy before method");
			Long createTime = (Long) object.getClass().getMethod("getCreateTime").invoke(object, new Object[] {});
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
			Integer routeNumber = Integer.valueOf(sdf.format(new Date(createTime)));
			System.out.println("动态代理分配到数据源： DB_" + routeNumber);
			DynamicDataSourceEntry.set(routeNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void after() {
		System.out.println("proxy after method");
		DynamicDataSourceEntry.reset();
	}

}
