package com.ok.example.dp.creational.singleton;

/**
 * @author SURAJ
 * 
 * Singleton using Enum.
 *
 */
public enum Singleton {

	OBJ1(44, "First Object");

	private int id;
	private String name;

	private Singleton(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Info getInfo() {

		Info info = new Info();
		
		info.setId(this.id);
		info.setName(this.name());
		return info;
	}

}

class Info {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Info [id=" + id + ", name=" + name + "]";
	}

}