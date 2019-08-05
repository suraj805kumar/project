package com.ok.example.dp.creational.prototype;

public class Person2 implements Prototype2<Person2> {
	private String name;
	private String city;
	private int age;
	private int amount;

	public Person2(String name, String city, int age, int amount) {
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
		return "Person2 [name=" + name + ", city=" + city + ", age=" + age + ", amount=" + amount + "]";
	}

	@Override
	public Person2 getClone() {
		try {
			return (Person2) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
