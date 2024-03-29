package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    @DisplayName("Add with custom delimiter")
    public void addWithCustomDelimiter() {
        int result = calculator.Add("//;\n1;2");
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Add with custom delimiters and new lines")
    public void addWithCustomDelimitersAndNewLines() {
        int result = calculator.Add("//|\n1|2\n3");
        assertEquals(6, result);
    }

    @Test
    @DisplayName("Add with negative numbers")
    public void addWithNegativeNumbers() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> calculator.Add("1,-2,3,-4"));
        assertEquals("Negatives not allowed: -2, -4", exception.getMessage());
    }

    @Test
    @DisplayName("Ignore numbers greater than 1000")
    public void ignoreNumbersGreaterThan1000() {
        int result = calculator.Add("2,1001,5,2000");
        assertEquals(7, result);

    }

    @Test
    @DisplayName("Add with custom delimiter of any length")
    public void addWithCustomDelimiterOfAnyLength() {
        int result = calculator.Add("//[***]\n1***2***3");
        assertEquals(6, result);
    }

    @Test
    @DisplayName("Add with multiple delimiters")
    public void addWithMultipleDelimiters() {
        int result = calculator.Add("//[***][%]\n1***2%3");
        assertEquals(6, result);
    }

    @Test
    @DisplayName("Add with multiple delimiters of any length")
    public void addWithMultipleDelimitersOfAnyLength () {
        int result = calculator.Add("//[***][%%]\n1***2%%3");
        assertEquals(6, result);
    }

}
