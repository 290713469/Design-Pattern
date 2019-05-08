/**
 * 
 */
package com.yrk.designpattern.singleton;

/**
 * @author runkaiyang
 *
 */
public class LazyInnerClassSingleton {
	
	// 如果没使用的时候，不会加载内部类
	private LazyInnerClassSingleton() {
		if (LazyHolder.instance != null) {
			throw new RuntimeException("不允许创建多个实例");
		}
	}
	
	public static final LazyInnerClassSingleton getInstance() {
		// 在返回结果前，一定会加载内部类
		return LazyHolder.instance;
	}
	
	private static class LazyHolder {
		private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
	}
}
