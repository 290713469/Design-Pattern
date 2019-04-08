/**
 * 
 */
package com.yrk.designpattern.proxypattern.staticproxy;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.yrk.designpattern.proxypattern.common.Order;
import com.yrk.designpattern.proxypattern.common.services.OrderService;
import com.yrk.designpattern.proxypattern.common.services.OrderServiceBean;

/**
 * @author runkaiyang
 *
 */
public class OrderServiceStaticProxyTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Order order = new Order();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse("2017/02/02");
		order.setCreateTime(date.getTime());
		OrderService orderService = new OrderServiceStaticProxy(new OrderServiceBean());
		orderService.createOrder(order);
	}

}
