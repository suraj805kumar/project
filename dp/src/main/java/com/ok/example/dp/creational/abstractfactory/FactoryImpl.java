package com.ok.example.dp.creational.abstractfactory;

public class FactoryImpl implements Factory {
	
	private VehicleFactory vehicleFactory = new VehicleFactoryImpl();
	private ParkingFactory parkingFactory = new ParkingFactoryImpl();

	@Override
	public Vehicle getVehicle(VehicleType vehicleType) {		
		return this.vehicleFactory.getVehicle(vehicleType);
	}

	@Override
	public Parking getParking(VehicleType vehicleType) {
		return this.parkingFactory.getParking(vehicleType);
	}

}
