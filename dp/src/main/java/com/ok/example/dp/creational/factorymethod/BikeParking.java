package com.ok.example.dp.creational.factorymethod;

public class BikeParking implements Parking {
	@Override
	public Vehicle getVehicle() {
		return new Bike();
	}
}
