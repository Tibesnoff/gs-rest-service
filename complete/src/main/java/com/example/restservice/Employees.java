package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
