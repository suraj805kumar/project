package com.ok.example.dp.creational.factorymethod;

public class BusParking implements Parking {
	@Override
	public Vehicle getVehicle() {
		return new Bus();
	}
}
