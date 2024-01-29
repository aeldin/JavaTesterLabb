package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator {
    public int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            String customDelimiter = numbers.substring(2, delimiterIndex);
            String numbersSubstring = numbers.substring(delimiterIndex + 1);

            String[] nums = numbersSubstring.split("[" + customDelimiter + "\n]+");



            return handleNumbers(nums);
        }


        String[] nums = numbers.split("[,\n]");
        return handleNumbers(nums);
    }

    private int handleNumbers(String[] nums) {
        List<Integer> negativeNumbers = new ArrayList<>();
        int sum = 0;
        for (String num : nums) {
            int currentNum = Integer.parseInt(num);
            if (currentNum < 0) {
                negativeNumbers.add(currentNum);
            }else if (currentNum <= 1000) {
                sum += currentNum;
            }

        }
        if (!negativeNumbers.isEmpty()) {
            throw new RuntimeException("Negatives not allowed: " + negativeNumbers.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(", ")));
        }
        return sum;
    }
}
