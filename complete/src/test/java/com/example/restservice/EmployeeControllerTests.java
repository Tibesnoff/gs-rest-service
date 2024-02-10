package com.example.restservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.restservice.types.ResponseType;

public class EmployeeControllerTests {

    @InjectMocks
    EmployeesController employeesController;

    @Mock
    EmployeeManager employeeManager;

@BeforeEach
public void init() {
	MockitoAnnotations.openMocks(this);
}

    @Test
    public void testGetEmployees() {
        Employees employees = new Employees();
		employees.addEmployee(new Employee(1, "John", "Doe", "JohnDoe@gmail.com", "Software Engineer"));
        when(employeeManager.getEmployees()).thenReturn(employees);

        ResponseType<Employees> response = employeesController.getEmployees();

        assertEquals("200", response.getStatus());
        assertEquals(employees, response.getMessage());
    }

    @Test
    public void testAddEmployee() {
        Employee newEmployee = new Employee(1, "John", "Doe", "john.doe@example.com", "Software Engineer");
        when(employeeManager.addEmployee(newEmployee)).thenReturn(newEmployee);

        ResponseType<Employee> response = employeesController.addEmployee(newEmployee);

        assertEquals("200", response.getStatus());
        assertEquals(newEmployee, response.getMessage());
    }
}