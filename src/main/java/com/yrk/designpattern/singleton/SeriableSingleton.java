/**
 * 
 */
package com.yrk.designpattern.singleton;

import java.io.Serializable;

/**
 * @author runkaiyang
 *      �����л�ʱ���µ������ƻ�
 */
public class SeriableSingleton implements Serializable{

	// ���л�����˵���ڴ��е�״̬ͨ��ת�����ֽ������ʽ���Ӷ�ת��һ��IO����д�뵽�����ط�
	// �����л��ǽ��Ѿ��־û����ֽ������ݣ�ת����IO����ͨ��IO���Ķ�ȡ��������ת��ΪJava����
	// ��ת�������л����´�������
	
	private static SeriableSingleton instance = new SeriableSingleton();
	
	private SeriableSingleton() {}
	
	public static SeriableSingleton getInstance() {
		return instance;
	}
	
	private Object readResolve() {
		return instance;
	}
}
