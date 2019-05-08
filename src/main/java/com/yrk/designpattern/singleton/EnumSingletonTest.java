package com.yrk.designpattern.singleton;

import java.lang.reflect.Constructor;

public class EnumSingletonTest {

	public static void main(String[] args) {
		try {
			Class clazz = EnumSingleton.class;
			Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
			c.setAccessible(true);
			EnumSingleton enumSingleton = (EnumSingleton)c.newInstance("Test", 666);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		EnumSingleton e1 = null;
//		EnumSingleton e2 = EnumSingleton.getInstance();
//		e2.setData(new Object());
//		
//		FileOutputStream fos = null;	
//		try {
//			fos = new FileOutputStream("SeriableSingleton.obj");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(e2);
//			oos.flush();
//			oos.close();
//			
//			FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			e1 = (EnumSingleton) ois.readObject();
//			ois.close();
//			
//			System.out.println(e1);
//			System.out.println(e2);
//			System.out.println(e1 == e2);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
