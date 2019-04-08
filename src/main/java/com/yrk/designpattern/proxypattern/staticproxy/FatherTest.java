/**
 * 
 */
package com.yrk.designpattern.proxypattern.staticproxy;

import com.yrk.designpattern.proxypattern.common.Son;

/**
 * @author runkaiyang
 *
 */
public class FatherTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Father father = new Father(new Son());
		father.findLover();
	}

}
