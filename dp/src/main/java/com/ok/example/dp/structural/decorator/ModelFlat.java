package com.ok.example.dp.structural.decorator;

public class ModelFlat implements Flat {

	@Override
	public void getName() {
		System.out.print("Flat in DK...");
	}

	@Override
	public void getFeatures() {
		System.out.print("Swimming Pool, Gym, Association, Security, 24/7 Electricity, Childern's Play Area, Cricket Play Area, Indoor Game, Park ");

	}

}
