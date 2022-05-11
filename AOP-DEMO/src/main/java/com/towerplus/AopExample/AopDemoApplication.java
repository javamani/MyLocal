package com.towerplus.AopExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.towerplus.AopExample.model.Employee;
import com.towerplus.AopExample.service.EmployeeService;

@SpringBootApplication
public class AopDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(AopDemoApplication.class, args);
		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
		employeeService.addEmployee(new Employee(100L, "ramesh", "fadatare", "ramesh@gmail.com"));
		employeeService.getEmployeeById(100L);
		employeeService.getAllEmployees();
	}

}
