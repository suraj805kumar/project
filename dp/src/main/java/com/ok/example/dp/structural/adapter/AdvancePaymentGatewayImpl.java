package com.ok.example.dp.structural.adapter;

public class AdvancePaymentGatewayImpl implements AdvancePaymentGateway {
	private PaymentGateway paymentGateway;
	public AdvancePaymentGatewayImpl(PaymentGateway paymentGateway) {
		super();
		this.paymentGateway = paymentGateway;
	}
	@Override
	public void doPayment(Mobile mob1, Mobile mob2) {
		System.out.println("Payment stated using Mobile Info...");
		Account acc1 = getAccountByMobile(mob1);
		Account acc2 = getAccountByMobile(mob2);
		this.paymentGateway.doPayment(acc1, acc2);
	}
	private Account getAccountByMobile(Mobile mob1) {
		System.out.println("Get Account by Mobile..");
		return new Account();
	}
}
