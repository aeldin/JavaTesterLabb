package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    StringCalculator calculator = new StringCalculator();

    @Test
    @DisplayName("Add empty string")
    public void addEmptyString() {
        int result = calculator.Add("");
        assertEquals(0,result);
    }

    @Test
    @DisplayName("Add single number")
    public void addSingleNumber() {
        int result = calculator.Add("1");
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Add two numbers")
    public void addTwoNumbers() {
        int result = calculator.Add("1,2");
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Add unknown amount of numbers")
    public void addUnknownAmountOfNumbers() {
        int result = calculator.Add("1,2,3,4,5");
        assertEquals(15, result);
    }

    @Test
    @DisplayName("Add new lines between numbers")
    public void addNewLinesBetweenNumbers() {
        int result = calculator.Add("1\n2,3");
        assertEquals(6,result);
    }


}
