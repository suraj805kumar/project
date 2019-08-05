package com.ok.example.dp.structural.adapter;

public class Mobile {
	private long number;
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Mobile [number=" + number + "]";
	}
}
