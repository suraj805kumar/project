package com.ok.example.dp.behavioral.command;

public class CommandClient {

	public static void main(String[] args) {
		
		SwitchBoard sb = new SwitchBoard(new Fan(new On()));
		sb.invoke();

		sb = new SwitchBoard(new AirCon(new Off()));
		sb.invoke();
	}
}
