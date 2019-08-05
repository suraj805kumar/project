package com.ok.example.dp.creational.factorymethod;

public interface VehicleFactory {	
	// factory method to return a Product
	Vehicle getVehicle(String vehicleType);
}
