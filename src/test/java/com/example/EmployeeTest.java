package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee = new Employee("123", 50000.0);

    @Test
    @DisplayName("Test constructor")
    public void testConstructor() {
        assertEquals("123", employee.getId());
        assertEquals(50000.0, employee.getSalary(), 0.001);
        assertFalse(employee.isPaid());
    }

    @Test
    @DisplayName("Test getter and setter for Id")
    public void testGetterAndSetterForId() {
        employee.setId("555");
        assertEquals("555", employee.getId());
    }

    @Test
    @DisplayName("Test getter and setter for Paid")
    public void testGetterAndSetterForPaid() {
       assertFalse(employee.isPaid());

       employee.setPaid(true);
       assertTrue(employee.isPaid());
    }

    @Test
    @DisplayName("Test getter and setter for salary")
    public void testGetterAndSetterForSalary() {
        employee.setSalary(35000.0);
        assertEquals(35000.0, employee.getSalary(), 0.001);
    }

    @Test
    @DisplayName("Test toString")
    public void testToString() {
        String expectedString = "Employee [id=123, salary=50000.0]";
        assertEquals(expectedString, employee.toString());
    }

}