/**
 * 
 */
package com.yrk.designpattern.proxypattern.common.services;

import com.yrk.designpattern.proxypattern.common.Order;
import com.yrk.designpattern.proxypattern.common.OrderDao;

/**
 * @author runkaiyang
 *
 */
public class OrderServiceBean implements OrderService {
	
	private OrderDao orderDao;
	
	public OrderServiceBean() {
		this.orderDao = new OrderDao();
	}

	/* (non-Javadoc)
	 * @see com.yrk.designpattern.proxypattern.common.services.OrderService#createOrder(com.yrk.designpattern.proxypattern.common.Order)
	 */
	public int createOrder(Order order) {
		System.out.println("OrderService 调用OrderDao创建Order");
		return orderDao.insert(order);
	}

}
