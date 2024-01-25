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
}