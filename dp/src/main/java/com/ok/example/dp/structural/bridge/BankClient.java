package com.ok.example.dp.structural.bridge;

public class BankClient {
	
	public static void main(String [] args) {
		
		Account savingAcc = new AccountSaving();
		Account currentAcc = new AccountCurrent();
		
		Bank bank = new BankIdfc();	
		
		bank.setAccount(savingAcc);		
		bank.startBankingService();
		
		bank.setAccount(currentAcc);
		bank.startBankingService();
		
		
	}

}
