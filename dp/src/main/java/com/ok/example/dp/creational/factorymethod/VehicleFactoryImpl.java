package com.ok.example.dp.creational.factorymethod;

public class VehicleFactoryImpl implements VehicleFactory {

	@Override
	public Vehicle getVehicle(String vehicleType) {
		Vehicle v = null;
		
		switch (vehicleType) {
		case "CAR":
			return new Car();
		case "BUS":
			return new Bus();
		case "BIKE":
			return new Bike();
		default:
			return v;
		}
	}
}
