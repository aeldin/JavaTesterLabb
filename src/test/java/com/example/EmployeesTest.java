package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmployeesTest {

    EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
    BankService bankService = mock(BankService.class);
    Employees employees = new Employees(employeeRepository, bankService);
    List<Employee> employeesList = Arrays.asList(new Employee("123", 50000.0), new Employee("124", 55000.0));

    @Test
    @DisplayName("Test payEmployees Success")
    public void testPayEmployeesSuccess() {


        when(employeeRepository.findAll()).thenReturn(employeesList);

        doNothing().when(bankService).pay(anyString(), anyDouble());

        int payments = employees.payEmployees();

        assertEquals(2, payments);
        assertTrue(employeesList.get(0).isPaid());
        assertTrue(employeesList.get(1).isPaid());
    }




}