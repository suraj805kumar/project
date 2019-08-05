package com.ok.example.dp.creational.singleton;

import java.util.Objects;

public class Singleton1 implements Cloneable{
	
	private Singleton1() {}

	private static Singleton1 instance;

	public static Singleton1 getSingleton1() {

		if (Objects.isNull(instance)) {
			synchronized (Singleton1.class) {
				if (Objects.isNull(instance)) {
					instance = new Singleton1();
				}
			}
		}
		return instance;
	}
	
	protected Object clone() {
		return instance;
	}
	
	private Object readResolve()  {
	    return instance;
	}	

}
