/**
 * 
 */
package com.yrk.designpattern.proxypattern.dynamicproxy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.yrk.designpattern.proxypattern.common.Customer;
import com.yrk.designpattern.proxypattern.common.Person;

import sun.misc.ProxyGenerator;

/**
 * @author runkaiyang
 *
 */
public class JDKMeiPoTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Person person = (Person) new JDKMeiPo().getInstance(new Customer());
		person.findLover();
		
		byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
		FileOutputStream os = new FileOutputStream("E://sourceCode//$Proxy0.class");
		os.write(bytes);
		os.close();
	}

}
