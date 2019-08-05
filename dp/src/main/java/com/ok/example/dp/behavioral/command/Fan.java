package com.ok.example.dp.behavioral.command;

public class Fan implements ElectricEquip {

	private ElectricOperation eo;
	
	public Fan(ElectricOperation eo) {		
		this.eo = eo;
	}
	
	@Override
	public void execute() {
		System.out.println("Fan");
		this.eo.action();
	}
}
