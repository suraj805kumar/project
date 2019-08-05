package com.ok.example.dp.structural.decorator;

public class DecoratorClient {

	public static void main(String[] args) {
		
		ModelFlat modelFlat = new ModelFlat();
		
		Flat f1 = new OneBHKFlat(modelFlat);
		
		f1.getName();
		f1.getFeatures();
		
		Flat f2 = new TwoBHKFlat(modelFlat);
		
		f2.getName();
		f2.getFeatures();

	}

}
