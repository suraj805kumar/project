package com.ok.example.dp.creational.abstractfactory;

public class AbstractFactoryClient {

	public static void main(String[] args) {
		Factory factory = new FactoryImpl();
		
		Parking p1 = factory.getParking(VehicleType.CAR);
		System.out.println(p1.getSpace());
		Parking p2 = factory.getParking(VehicleType.BUS);
		System.out.println(p2.getSpace());
		Parking p3 = factory.getParking(VehicleType.BIKE);
		System.out.println(p3.getSpace());
		
		factory.getVehicle(VehicleType.BIKE);
		factory.getVehicle(VehicleType.BUS);
		factory.getVehicle(VehicleType.CAR);
		

	}

}
