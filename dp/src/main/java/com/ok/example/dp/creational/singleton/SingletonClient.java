package com.ok.example.dp.creational.singleton;

public class SingletonClient {

	public static void main(String[] args) {

		Singleton s1 = Singleton.OBJ1;

		Singleton s2 = Singleton.OBJ1;
		Singleton s3 = Singleton.OBJ1;

		System.out.println(s1 == s2); // true

		System.out.println(s1 == s3); // true

		System.out.println(s1.getInfo()); // Info [id=44, name=OBJ1]
		System.out.println(s2.getInfo()); // Info [id=44, name=OBJ1]
		System.out.println(s3.getInfo()); // Info [id=44, name=OBJ1]
		
		Singleton1 obj1 = Singleton1.getSingleton1();
		Singleton1 obj2 = Singleton1.getSingleton1();
		Singleton1 obj3 = Singleton1.getSingleton1();
		System.out.println(obj1 == obj2);
		System.out.println(obj1 == obj3);
		

	}

}
