/**
 * 
 */
package com.yrk.designpattern.singleton;

/**
 * @author runkaiyang
 *
 */
public class LazyInnerClassSingleton {
	
	// ���ûʹ�õ�ʱ�򣬲�������ڲ���
	private LazyInnerClassSingleton() {
		if (LazyHolder.instance != null) {
			throw new RuntimeException("�����������ʵ��");
		}
	}
	
	public static final LazyInnerClassSingleton getInstance() {
		// �ڷ��ؽ��ǰ��һ��������ڲ���
		return LazyHolder.instance;
	}
	
	private static class LazyHolder {
		private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
	}
}
