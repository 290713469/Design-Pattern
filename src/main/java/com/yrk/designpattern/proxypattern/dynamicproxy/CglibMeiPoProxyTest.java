package com.yrk.designpattern.proxypattern.dynamicproxy;

import com.yrk.designpattern.proxypattern.common.Customer;

import net.sf.cglib.core.DebuggingClassWriter;

public class CglibMeiPoProxyTest {

	public static void main(String[] args) {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
				"E://sourceCode//cglib_proxy_class/");
		Customer customer = (Customer) new CglibMeiPoProxy().getInstance(Customer.class);
		customer.findLover();
	}

}
