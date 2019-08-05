package com.ok.example.dp.structural.proxy;

import java.util.Objects;

public class ProxySavingAccount implements Account {

	private SavingAccount savingAccount;

	@Override
	public void accoutType() {
		if (Objects.isNull(savingAccount)) {
			savingAccount = new SavingAccount();
		}
		System.out.println("Using Proxy Saving Account");
		savingAccount.accoutType();
	}
}
