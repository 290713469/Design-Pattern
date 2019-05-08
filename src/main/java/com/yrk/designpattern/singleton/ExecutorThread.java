/**
 * 
 */
package com.yrk.designpattern.singleton;

/**
 * @author runkaiyang
 *
 */
public class ExecutorThread implements Runnable {

	@Override
	public void run() {
		ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
		System.out.println(Thread.currentThread().getName() + ":" + singleton);
	}

}
