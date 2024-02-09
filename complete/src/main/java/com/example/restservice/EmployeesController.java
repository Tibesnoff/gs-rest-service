package com.example.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.types.ResponseType;

@RestController
public class EmployeesController {
    @Autowired
    private EmployeeManager employeeManager;

        @GetMapping("/employees")
        public ResponseType<Employees> getEmployees() {
            Employees employees = employeeManager.getEmployees();

            String status = employees != null ? "200" : "500";

            ResponseType<Employees> response = new ResponseType(employees, status);
            
            return response;
        }

    @PostMapping("/employees")
    /* 
    * Example request body:
    * {
    *   "employee_id": 1,
    *   "first_name": "John",
    *   "last_name": "Doe",
    *   "email": "john.doe@example.com",
    *   "title": "Software Engineer"
    * }
    */
    public ResponseType<Employee> addEmployee(@RequestBody Employee newEmployee) {
        try {
            Employee employee = employeeManager.addEmployee(newEmployee);

            String status = employee != null ? "200" : "500";

            ResponseType<Employee> response = new ResponseType<>(employee, status);

            return response;

        } catch (Exception e) {

            ResponseType<Employee> response = new ResponseType<>(null, "500");

            return response;
        }
    }
}
