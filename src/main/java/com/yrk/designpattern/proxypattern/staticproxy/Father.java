/**
 * 
 */
package com.yrk.designpattern.proxypattern.staticproxy;

import com.yrk.designpattern.proxypattern.common.Son;

/**
 * @author runkaiyang
 *
 */
public class Father {

	private Son son = null;
	
	public Father(Son son) {
		this.son = son;
	}
	
	public void findLover() {
		System.out.println("父母物色对象");
		this.son.findLover();
		System.out.println("双方同意");
	}
}
