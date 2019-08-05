package com.ok.example.dp.creational.prototype;


public class PrototypeClient {

	public static void main(String[] args) {
		
		Person person1 = new Person("abc", "Bangalore",35,5000);
		System.out.println(person1);
		Person newPerson1 = person1.getClone();
		System.out.println(newPerson1);
		
		Person2 person2 = new Person2("ikiu", "Chennai",36,6000);
		System.out.println(person2);
		Person2 newPerson2 = person2.getClone();
		System.out.println(newPerson2);
	}

}
