package com.ok.example.dp.behavioral.command;

public class Light implements ElectricEquip {

	private ElectricOperation eo;
	
	public Light(ElectricOperation eo){
		this.eo = eo;
	}
	
	@Override
	public void execute() {
		System.out.println("Light");
		this.eo.action();

	}
}
