package com.ok.example.dp.creational.abstractfactory;

public class VehicleFactoryImpl implements VehicleFactory {

	@Override
	public Vehicle getVehicle(VehicleType vehicleType) {
		switch (vehicleType) {

		case CAR:
			return new Car();
		case BIKE:
			return new Bike();
		case BUS:
			return new Bus();
		default:
			return null;
		}
	}

}
