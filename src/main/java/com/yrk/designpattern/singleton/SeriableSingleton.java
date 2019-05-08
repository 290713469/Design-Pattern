/**
 * 
 */
package com.yrk.designpattern.singleton;

import java.io.Serializable;

/**
 * @author runkaiyang
 *      反序列化时导致单例被破坏
 */
public class SeriableSingleton implements Serializable{

	// 序列化就是说把内存中的状态通过转换成字节码的形式，从而转换一个IO流，写入到其它地方
	// 反序列化是讲已经持久化的字节码内容，转换成IO流。通过IO流的读取，将内容转化为Java对象
	// 在转换过程中会重新创建对象
	
	private static SeriableSingleton instance = new SeriableSingleton();
	
	private SeriableSingleton() {}
	
	public static SeriableSingleton getInstance() {
		return instance;
	}
	
	private Object readResolve() {
		return instance;
	}
}
