package com.ok.example.dp.behavioral.chainofresponsibility;

public class Handler500 implements Handler {

	private Handler nextHandler;

	@Override
	public void setNextHandler(Handler handler) {
		this.nextHandler = handler;

	}

	@Override
	public void handleRequest(Request request) {

		if (request.getAmount() / 500 > 0) {
			System.out.println("Notes of 500 : " + request.getAmount() / 500);
		}

		if (request.getAmount() % 500 > 0) {
			request.setAmount(request.getAmount() % 500);
			nextHandler.handleRequest(request);
		}

	}

}
