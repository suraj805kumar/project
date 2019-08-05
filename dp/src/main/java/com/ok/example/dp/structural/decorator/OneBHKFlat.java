package com.ok.example.dp.structural.decorator;

public class OneBHKFlat extends FlatDecorator {
		
	public OneBHKFlat(Flat flat) {
		super(flat);
	}
	
	public void getName() {
		super.getName();
		System.out.print(" => 1BHK");
		System.out.println();
	}
	
	public void getFeatures() {
		super.getFeatures();
		System.out.print(" => One Bed Room, One Hall, One Kitchen, One Balcony, One Bathroom.");
		System.out.println();
	}

}
