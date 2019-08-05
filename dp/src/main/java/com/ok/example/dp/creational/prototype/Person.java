package com.ok.example.dp.creational.prototype;

public class Person implements Prototype<Person> {
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

	@Override
	public Person getClone() {
		Person p = new Person(this.name, this.city, this.age, this.amount);
		return p;
	}

}
