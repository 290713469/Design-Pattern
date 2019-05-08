/**
 * 
 */
package com.yrk.designpattern.singleton;

/**
 *   利用静态代码块实现饿汉式单例
 * @author runkaiyang
 *
 */
public class Singleton4 {
	
	private static Singleton4 instance;
	static {
		instance = new Singleton4();
	}
	
	private Singleton4() {}
	
	public static Singleton4 getInstance() {
		return instance;
	}

}
