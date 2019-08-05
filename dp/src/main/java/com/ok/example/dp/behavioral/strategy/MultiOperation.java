package com.ok.example.dp.behavioral.strategy;

public class MultiOperation implements Operation {
	@Override
	public double performOpertion(int op1, int op2) {
		return op1*op2;
	}
}
