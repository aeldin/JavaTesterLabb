package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    @DisplayName("Test constructor")
    public void testConstructor() {
        Employee employee = new Employee("123", 50000.0);
        assertEquals("123", employee.getId());
        assertEquals(50000.0, employee.getSalary(), 0.001);
        assertFalse(employee.isPaid());
    }

    @Test
    @DisplayName("Test getter and setter for Id")
    public void testGetterAndSetterForId() {
        Employee employee = new Employee("456", 75000.0);
        employee.setId("555");
        assertEquals("555", employee.getId());
    }

    @Test
    @DisplayName("Test getter and setter for Paid")
    public void testGetterAndSetterForPaid() {
       Employee employee = new Employee("111", 53000.0);
       assertFalse(employee.isPaid());

       employee.setPaid(true);
       assertTrue(employee.isPaid());
    }

    @Test
    @DisplayName("Test getter and setter for salary")
    public void testGetterAndSetterForSalary() {
        Employee employee = new Employee("333", 27000.0);
        employee.setSalary(35000.0);
        assertEquals(35000.0, employee.getSalary(), 0.001);
    }

    @Test
    @DisplayName("Test toString")
    public void testToString() {
        Employee employee = new Employee("202", 90000.0);
        String expectedString = "Employee [id=202, salary=90000.0]";
        assertEquals(expectedString, employee.toString());
    }

}