package com.ok.example.dp.structural.bridge;

public class AccountCurrent implements Account {

	@Override
	public String accountType() {
		return "Current Account";
	}

}
