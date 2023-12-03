package org.example.homework4;

import java.util.Arrays;

public class MissingNumberApp {
    public static void main(String[] args) {
        int[] number = { 3, 0, 1};

        int missingNum = missingNumber(number);
        System.out.println(missingNum);
    }

    private static int missingNumber(int[] nums) {
        int n = nums.length;
        int findNum = (n * (n + 1) / 2);

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return findNum - sum;
    }
}
