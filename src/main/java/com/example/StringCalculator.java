package com.example;

public class StringCalculator {
    public int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String[] nums = numbers.split(",");
        if(nums.length == 1) {
            return Integer.parseInt(nums[0]);
        } else {
            return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
        }

    }
}
