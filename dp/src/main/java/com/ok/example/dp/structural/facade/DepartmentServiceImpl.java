package com.ok.example.dp.structural.facade;

public class DepartmentServiceImpl implements DepartmentService {

	@Override
	public Department add(Department d) {
		System.out.println("Added department : " + d);
		return d;
	}

	@Override
	public Department update(Department d) {
		System.out.println("Updated Department : " + d);
		return d;
	}

}
