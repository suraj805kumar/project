package com.ok.example.dp.creational.abstractfactory;

public interface Factory {	
	Vehicle getVehicle(VehicleType vehicleType);
	Parking getParking(VehicleType vehicleType);
}
