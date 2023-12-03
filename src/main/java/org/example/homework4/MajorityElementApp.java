package org.example.homework4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MajorityElementApp {
    public static void main(String[] args) {
        int[] input = {2, 2, 1, 4, 1, 3, 2, 3, 4, 1, 1, 3, 3, 3}; // length 7
        int element = majorityElement(input);
        System.out.println(element);
    }

    private static int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                element = nums[i];
            }
            if (element == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }
}
