package com.example;

public class StringCalculator {
    public int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            String customDelimiter = numbers.substring(2,delimiterIndex);
            String numbersSubstring = numbers.substring(delimiterIndex + 1);

            String[] nums = numbersSubstring.split("[" + customDelimiter + "\n]+");
            int sum = 0;
            for (String num : nums) {
                sum += Integer.parseInt(num);
            }
            return sum;

        }


        String[] nums = numbers.split("[,\n]");
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
