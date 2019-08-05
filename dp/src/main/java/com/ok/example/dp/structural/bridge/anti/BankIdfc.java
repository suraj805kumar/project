package com.ok.example.dp.structural.bridge.anti;

public class BankIdfc implements Bank {

	@Override
	public void startBankingService() {
		System.out.println("Start Banking service in Axis Bank");
	}

}
