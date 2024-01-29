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


    }


}
