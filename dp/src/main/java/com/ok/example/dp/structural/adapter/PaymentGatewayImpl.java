package com.ok.example.dp.structural.adapter;

public class PaymentGatewayImpl implements PaymentGateway {
	@Override
	public void doPayment(Account acc1, Account acc2) {
		System.out.println("Payment done by Account Info!");
	}
}
