package com.ok.example.dp.creational.factorymethod;

public class CarParking implements Parking {
	@Override
	public Vehicle getVehicle() {
		return new Car();
	}
}
