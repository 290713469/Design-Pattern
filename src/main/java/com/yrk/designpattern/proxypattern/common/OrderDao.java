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
		System.out.println("OrderDao����Order�ɹ�");
		return 1;
	}

}
