package com.ok.example.dp.behavioral.command;

public class SwitchBoard {

	private ElectricEquip ee;

	public SwitchBoard(ElectricEquip ee) {
		this.ee = ee;
	}

	public void invoke() {
		System.out.println("SwitchBoard -> Invoker");
		this.ee.execute();
	}
}
