package com.example.restservice;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {
    private Employees employees;
    
    public EmployeeManager() {
        this.employees = new Employees();

        employees.addEmployee(new Employee(1, "John", "Doe", "JohnDoe@gmail.com", "Manager"));
        employees.addEmployee(new Employee(2, "Jane", "Doe", "JaneDoe@gmail.com", "Assistant Manager"));
        employees.addEmployee(new Employee(3, "Bob", "Smith", "BobSmith@gmail.com", "Sales"));
        employees.addEmployee(new Employee(4, "Sue", "Smith", "SueSmith@gmail.com", "Sales"));
    }

    public Employees getEmployees() {
        return employees;
    }

    public Employee addEmployee(Employee employee) {
        try {
            employees.addEmployee(employee);
            return employee;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
