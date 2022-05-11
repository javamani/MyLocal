package com.towerplus.AopExample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.towerplus.AopExample.model.Employee;

@Service
public class EmployeeService {
	

    private List < Employee > employeesList = new ArrayList < > ();

    public List < Employee > getAllEmployees() {
        System.out.println("Method getAllEmployees() called");
        return employeesList;
    }

    public Employee getEmployeeById(Long employeeId) {
        System.out.println("Method getEmployeeById() called");
        for (Employee employee: employeesList) {
            if (employee.getId() == Long.valueOf(employeeId)) {
                return employee;
            }
        }
        return null;
    }

    
    public void addEmployee(Employee employee) {
        System.out.println("Method addEmployee() called");
        employeesList.add(employee);
    }

    public void updateEmployee(Employee employeeDetails) {
        System.out.println("Method updateEmployee() called");
        for (Employee employee: employeesList) {
            if (employee.getId() == Long.valueOf(employeeDetails.getId())) {
                employeesList.remove(employee);
                employeesList.add(employeeDetails);
            }
        }
    }

    public void deleteEmployee(Long employeeId) {
        System.out.println("Method deleteEmployee() called");
        for (Employee employee: employeesList) {
            if (employee.getId() == Long.valueOf(employeeId)) {
                employeesList.remove(employee);
            }
        }
    }

}
