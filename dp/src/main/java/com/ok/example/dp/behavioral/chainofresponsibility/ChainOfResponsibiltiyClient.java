package com.ok.example.dp.behavioral.chainofresponsibility;

public class ChainOfResponsibiltiyClient {

	public static void main(String[] args) {
		
		Handler handler2000 = new Handler2000();
		Handler handler500 = new Handler500();
		Handler handler100 = new Handler100();
		
		handler2000.setNextHandler(handler500);
		handler500.setNextHandler(handler100);
		
		Request req = new Request();
		req.setAmount(3800);
		handler2000.handleRequest(req);

	}

}
