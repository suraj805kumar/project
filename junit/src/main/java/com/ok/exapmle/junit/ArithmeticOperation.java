package com.ok.exapmle.junit;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticOperation {

	public long add (int a, int b) {
		return a + b;
	}
	
	
	public double div(int a, int b) throws Exception {
		// validation for divide by zero
		if(b == 0) {
			throw new RuntimeException();
		}
		// validation for maximum limit of input
		if(a>999999 || b>999999) {
			throw new Exception();
		}
		return a/b;
	}
	
	
}


