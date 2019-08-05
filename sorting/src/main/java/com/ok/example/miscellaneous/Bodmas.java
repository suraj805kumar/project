package com.ok.example.miscellaneous;

public class Bodmas {

	public static void main(String[] args) {

		System.out.println(breakExp("((8*(8/7))-(5+2))"));
		
	}
	
	
	public static String breakExp(String exp) {
	
		if(exp.contains("(") ) {
			String[] exps = exp.split("\\(");
			
		}
		return "";
		
	}
	
	public static double calculate(String exp) {
		
		
		
		if(exp.contains("OF")) {
			int oi = exp.indexOf("OF");
			double op1 = Double.valueOf(String.valueOf(exp.charAt(oi-1)));
			double op2 = Double.valueOf(String.valueOf(exp.charAt(oi+1)));
			return op1/op2;
		}
		if(exp.contains("/")) {
			int di = exp.indexOf("/");
			double op1 = Double.valueOf(String.valueOf(exp.charAt(di-1)));
			double op2 = Double.valueOf(String.valueOf(exp.charAt(di+1)));
			return op1/op2;
		}
		if(exp.contains("*")) {
			int mi = exp.indexOf("*");
			double op1 = Double.valueOf(String.valueOf(exp.charAt(mi-1)));
			double op2 = Double.valueOf(String.valueOf(exp.charAt(mi+1)));
			return op1*op2;
		}
		if(exp.contains("+")) {
			int ai = exp.indexOf('+');
			double op1 = Double.valueOf(String.valueOf(exp.charAt(ai-1)));
			double op2 = Double.valueOf(String.valueOf(exp.charAt(ai+1)));
			return op1+op2;
		}
		if(exp.contains("-")) {
			int si = exp.indexOf('-');
			double op1 = Double.valueOf(String.valueOf(exp.charAt(si-1)));
			double op2 = Double.valueOf(String.valueOf(exp.charAt(si+1)));
			return op1+op2;
		}
		
	 return 0.0;
	}

}
