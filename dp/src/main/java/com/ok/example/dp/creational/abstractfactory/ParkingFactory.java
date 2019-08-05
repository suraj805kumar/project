package com.ok.example.dp.creational.abstractfactory;

public interface ParkingFactory {
	Parking getParking(VehicleType vehicleType);
}
