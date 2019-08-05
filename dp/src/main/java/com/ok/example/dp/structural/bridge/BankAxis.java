package com.ok.example.dp.structural.bridge;

public class BankAxis implements Bank {

	
	
	@Override
	public void startBankingService() {
		System.out.println("Start Banking service in Axis Bank"+ " with " + getAccount().accountType()) ;
		
	}

	private Account account;
	
	public Account getAccount() {
		return account;
	}

	@Override
	public void setAccount(Account account) {
		this.account = account;
		
	}
	
	

}
