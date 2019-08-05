package com.ok.example.dp.creational.builder;

public class PersonBuilder {

	private Person object;
	
	public PersonBuilder(){
		this.object = new Person();
	}
	
	public PersonBuilder(Person person) {
		this.object = person;
	}

	public Person build() {
		return object;
	}

	public PersonBuilder setName(String name) {
		this.object.setName(name);
		return this;
	}

	public PersonBuilder setId(Integer id) {
		this.object.setId(id);
		return this;
	}

	public PersonBuilder setCity(String city) {
		this.object.setCity(city);
		return this;
	}

	public PersonBuilder setAge(int age) {
		this.object.setAge(age);
		return this;
	}

	public PersonBuilder setEamil(String eamil) {
		this.object.setEamil(eamil);
		return this;
	}

	public PersonBuilder setMob(long mob) {
		this.object.setMob(mob);
		return this;
	}
}
