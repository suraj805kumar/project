package com.ok.example.dp.behavioral.command;

public class On implements ElectricOperation {

	@Override
	public void action() {
		System.out.println("Switch On");
	}
}
