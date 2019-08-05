package com.ok.example.dp.structural.bridge.anti;

public class BankIdfcCurrentAcc implements Bank{

	@Override
	public void startBankingService() {
		System.out.println("Start Banking service in Idfc Bank with Current Account");
		
	}

}
