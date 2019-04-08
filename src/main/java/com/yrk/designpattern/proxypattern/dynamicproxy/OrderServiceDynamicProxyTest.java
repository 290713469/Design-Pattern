/**
 * 
 */
package com.yrk.designpattern.proxypattern.dynamicproxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.yrk.designpattern.proxypattern.common.Order;
import com.yrk.designpattern.proxypattern.common.services.OrderService;
import com.yrk.designpattern.proxypattern.common.services.OrderServiceBean;

/**
 * @author runkaiyang
 *
 */
public class OrderServiceDynamicProxyTest {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		Order order = new Order();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse("2017/02/02");
		order.setCreateTime(date.getTime());
		OrderService orderService = (OrderService) new OrderServiceDynamicProxy().getInstance(new OrderServiceBean());
		orderService.createOrder(order);
	}

}
