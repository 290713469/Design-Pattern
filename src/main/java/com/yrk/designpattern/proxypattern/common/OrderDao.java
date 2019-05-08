/**
 * 
 */
package com.yrk.designpattern.proxypattern.common;

/**
 * @author runkaiyang
 *
 */
public class OrderDao {
	
	public int insert(Order order) {
		System.out.println("OrderDao创建Order成功");
		return 1;
	}

}
