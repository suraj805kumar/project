package com.ok.example.dp.behavioral.strategy;

public class OperationManager {

	private Operation operation;

	public OperationManager(Operation operation) {
		this.operation = operation;
	}

	public double calculate(int op1, int op2) {
		return this.operation.performOpertion(op1, op2);
	}
}
