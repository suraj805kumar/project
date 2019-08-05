package com.ok.example.dp.behavioral.chainofresponsibility;

public interface Handler {
	
	void setNextHandler(Handler handler);
	void handleRequest(Request request);

}
