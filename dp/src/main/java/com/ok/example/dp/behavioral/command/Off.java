package com.ok.example.dp.behavioral.command;

public class Off implements ElectricOperation {

	@Override
	public void action() {
		System.out.println("Switch Off");
	}
}
