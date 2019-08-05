package com.ok.example.dp.behavioral.strategy;

public class StrategyClient {

	public static void main(String[] args) {

		// setting Strategy Object inside the Context Object
		OperationManager om = new OperationManager(new AddOperation());
		// perform the action
		System.out.println("12 + 22 = " + om.calculate(12, 22));
		
		om = new OperationManager(new SubsOperation());
		System.out.println("55 - 7 = " + om.calculate(55, 7));
		
		om = new OperationManager(new MultiOperation());
		System.out.println("44 * 78 = " + om.calculate(44,78));
		
		om = new OperationManager(new DivOperation());
		System.out.println("98 / 7 = " + om.calculate(98, 7));
		
	}

}
