package com.ok.example.dp.behavioral.command;

public class AirCon implements ElectricEquip {

	private ElectricOperation eo;

	public AirCon(ElectricOperation eo) {		
		this.eo = eo;
	}

	@Override
	public void execute() {
		System.out.println("AirCon");
		this.eo.action();
	}
}
