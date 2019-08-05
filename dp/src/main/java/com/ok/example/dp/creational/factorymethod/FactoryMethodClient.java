package com.ok.example.dp.creational.factorymethod;

public class FactoryMethodClient {

	public static void main(String[] args) {

		VehicleFactoryImpl vf = new VehicleFactoryImpl();

		Vehicle v1 = vf.getVehicle("CAR");
		System.out.println(v1.getRequiredPrakingSpace());

		v1 = vf.getVehicle("BUS");
		System.out.println(v1.getRequiredPrakingSpace());

		v1 = vf.getVehicle("BIKE");
		System.out.println(v1.getRequiredPrakingSpace());
		
		
		Parking p = new CarParking();		
		System.out.println(p.getVehicle().getRequiredPrakingSpace());

	}
}
