package com.ok.example.dp.structural.decorator;

public class TwoBHKFlat extends FlatDecorator {
		
	public TwoBHKFlat(Flat flat) {
		super(flat);
	}
	
	public void getName() {
		super.getName();
		System.out.print(" => 2BHK");
		System.out.println();
	}
	
	public void getFeatures() {
		super.getFeatures();
		System.out.print(" => Two Bed Room, One Hall, One Kitchen, Two Balcony, Two Bathroom.");
		System.out.println();
	}

}
