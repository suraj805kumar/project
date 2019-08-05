package com.ok.example.dp.structural.facade;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee add(Employee e) {
		System.out.println("Added Employee : " + e);
		return e;
	}

	@Override
	public Employee update(Employee e) {
		System.out.println("Updated Employee : " + e);
		return e;
	}

}
