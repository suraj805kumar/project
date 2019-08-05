package com.ok.example.dp.creational.abstractfactory;

public class ParkingFactoryImpl implements ParkingFactory {

	@Override
	public Parking getParking(VehicleType vehicleType) {
		switch (vehicleType) {

		case CAR:
			return new CarParking();
		case BIKE:
			return new BikeParking();
		case BUS:
			return new BusParking();
		default:
			return null;
		}
	}

}
