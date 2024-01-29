package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    @DisplayName("Add empty string")
    public void addEmptyString () {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.Add("");
        assertEquals(0,result);
    }


}
