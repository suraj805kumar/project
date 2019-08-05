package com.ok.example.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		// create an ArrayList

		List<Integer> list = new ArrayList<>();

		// Create a list by an Array
		Integer[] arr = { 7, 8, 7, 5, 72, 8, 2, 44 };
		// print the array
		System.out.println(Arrays.toString(arr));

		List<Integer> l1 = Arrays.asList(arr);
		System.out.println(l1);
		// l1.add(33); //java.lang.UnsupportedOperationException

		// initialize the arraylist
		list.add(12);
		list.add(23);
		list.add(67);
		list.add(5);
		list.add(85);
		list.add(69);
		// get and set
		System.out.println(list.get(5));
		System.out.println(list.indexOf(67));
		System.out.println(list);// [12, 23, 67, 5, 85, 69]
		System.out.println(list.set(5, 67));
		System.out.println(list);// [12, 23, 67, 5, 85, 67]
		System.out.println(list.lastIndexOf(67));// 5

		// Traversal of an Array List
		// 1. for each
		for (Integer i : list) {
			System.out.println(i);
		}

		// 2. iterator
		Iterator<Integer> it = list.iterator();
		for (; it.hasNext();) {
			// System.out.println(it.next());
			if (it.next() == 67) {
				it.remove();
			}
		}

		System.out.println(list);// [12, 23, 5, 85]

		// add element as specific index
		// list.add(5, 67);//java.lang.IndexOutOfBoundsException: Index: 5, Size: 4
		list.add(3, 67);
		System.out.println(list);// [12, 23, 5, 67, 85]

		// 3. Using Aggregate
		Person person1 = new Person("abc", "Bangalore",35,5000);
		Person person2 = new Person("ikiu", "Chennai",36,6000);
		Person person3 = new Person("jyjj", "Hydrabad",30,7000);
		Person person4 = new Person("hghg", "Kolkata",33,8000);
		Person person5 = new Person("hghf", "Mysore",35,9000);
		Person person6 = new Person("sfdfs", "Patna",25,3000);
		List<Person> pList = new ArrayList<>();
		
		pList.add(person1);
		pList.add(person2);
		pList.add(person3);
		pList.add(person4);
		pList.add(person5);
		pList.add(person6);
		
		System.out.println(pList);
		
		//pList.stream().

	}
}

	class Person {
		private String name;
		private String city;
		private int age;
		private int amount;

		public Person(String name, String city, int age, int amount) {
			super();
			this.name = name;
			this.city = city;
			this.age = age;
			this.amount = amount;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", city=" + city + ", age=" + age + ", amount=" + amount + "]";
		}

	}


