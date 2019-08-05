package com.ok.example.dp.structural.adapter;

public class AdapterClient {

	public static void main(String[] args) {
		
		AdvancePaymentGateway apg = new AdvancePaymentGatewayImpl(new PaymentGatewayImpl());

		Mobile mob1 = new Mobile();
		Mobile mob2 = new Mobile();
		apg.doPayment(mob1, mob2);

	}
}
