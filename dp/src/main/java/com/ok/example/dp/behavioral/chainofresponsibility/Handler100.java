package com.ok.example.dp.behavioral.chainofresponsibility;

public class Handler100 implements Handler {

	private Handler nextHandler;

	@Override
	public void setNextHandler(Handler handler) {
		this.nextHandler = handler;

	}

	@Override
	public void handleRequest(Request request) {

		if (request.getAmount() / 100 > 0) {
			System.out.println("Notes of 100 : " + request.getAmount() / 100);
		}

		if (request.getAmount() % 100 > 0) {
			request.setAmount(request.getAmount() % 100);
			nextHandler.handleRequest(request);
		}

	}

}
