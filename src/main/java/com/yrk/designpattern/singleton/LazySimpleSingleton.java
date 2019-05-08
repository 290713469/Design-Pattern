package com.yrk.designpattern.singleton;

public class LazySimpleSingleton {
	
	//lazy mode
	private static LazySimpleSingleton instance;
	
	private LazySimpleSingleton() {
		
	}
	
	public static synchronized LazySimpleSingleton getInstance() {
		if (instance == null) {
			instance = new LazySimpleSingleton();
		}
		return instance;
	}
}
