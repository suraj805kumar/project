package com.ok.example.dp.structural.facade;

public class ServiceFacadeImpl implements ServiceFacade {

	private EmployeeService employeeService;
	private DepartmentService departmentService;

	public ServiceFacadeImpl() {
		this.employeeService = new EmployeeServiceImpl();
		this.departmentService = new DepartmentServiceImpl();
	}

	@Override
	public Department add(Department d) {
		return this.departmentService.add(d);
	}

	@Override
	public Department update(Department d) {
		return this.departmentService.update(d);
	}

	@Override
	public Employee add(Employee employee) {
		return this.employeeService.add(employee);
	}

	@Override
	public Employee update(Employee employee) {
		return this.employeeService.update(employee);
	}

}
