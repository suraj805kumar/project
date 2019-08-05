package com.ok.example.dp.structural.bridge.anti;

public class BankClient {
	
	public static void main(String [] args) {
		
		Bank bank = new BankIdfcCurrentAcc();
		bank.startBankingService();
		
		bank = new BankAxisCurrentAcc();
		bank.startBankingService();
		bank = new BankAxisSavingAcc();
		bank.startBankingService();
		
	}

}
