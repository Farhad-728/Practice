package org.example.homework4;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateApp {
    public static void main(String[] args) {
        int[] nums = {2, 14, 18, 22, 21};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            boolean added = set.add(num);
            if (!added) {
                return true;
            }
        }
        return false;
    }
}
