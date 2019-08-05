package com.ok.example.dp.structural.facade;

public class FacadeClient {
	
	public static void main(String... args) {
		ServiceFacade sf = new ServiceFacadeImpl();
		
		Department d = new Department();
		Employee e = new Employee();
		
		sf.add(d);
		sf.update(d);
		
		sf.add(e);
		sf.update(e);
		
	}

}
