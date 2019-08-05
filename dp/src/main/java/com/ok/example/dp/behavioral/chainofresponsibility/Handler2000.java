package com.ok.example.dp.behavioral.chainofresponsibility;

public class Handler2000 implements Handler {

	private Handler nextHandler;

	@Override
	public void setNextHandler(Handler handler) {
		this.nextHandler = handler;

	}

	@Override
	public void handleRequest(Request request) {

		if (request.getAmount() == 0 || request.getAmount() % 100 != 0) {
			System.out.println("Entered Amount is not correct: " + request.getAmount());
			return;
		}

		if (request.getAmount() / 2000 > 0) {
			System.out.println("Notes of 2000 : " + request.getAmount() / 2000);
		}
		
		if (request.getAmount() % 2000 > 0) {
			request.setAmount(request.getAmount() % 2000);
			nextHandler.handleRequest(request);
		}

	}

}
