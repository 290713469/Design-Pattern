/**
 * 
 */
package com.yrk.designpattern.proxypattern.staticproxy;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.yrk.designpattern.proxypattern.common.DynamicDataSourceEntry;
import com.yrk.designpattern.proxypattern.common.Order;
import com.yrk.designpattern.proxypattern.common.services.OrderService;

/**
 * @author runkaiyang
 *
 */
public class OrderServiceStaticProxy implements OrderService {
	
	private OrderService orderService;
	public OrderServiceStaticProxy(OrderService orderService) {
		this.orderService = orderService;
	}

	public int createOrder(Order order) {
		before();
		Long createTime = order.getCreateTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		Integer routeNumber = Integer.valueOf(sdf.format(new Date(createTime)));
		System.out.println("静态代理分配到数据源： DB_" + routeNumber);
		DynamicDataSourceEntry.set(routeNumber);
		this.orderService.createOrder(order);
		after();
		return 0;
	}

	private void after() {
		System.out.println("Proxy after method");
	}

	private void before() {
		System.out.println("Proxy before method");
	}

}
