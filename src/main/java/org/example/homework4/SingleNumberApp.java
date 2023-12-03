package org.example.homework4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SingleNumberApp {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4, 3};
        System.out.println(singleNumber2(nums));

    }

    private static int singleNumber(int[] nums) {
        List<Integer> pairList = new ArrayList<>();
        for (int n : nums) {
            if (pairList.contains(n)) {
                pairList.removeIf(num -> num.equals(n));
            } else {
                pairList.add(n);
            }
        }
        return pairList.stream().findFirst().orElse(-1);
    }
    private static int singleNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sumNums = 0;
        for (int val : nums) {
            if (set.contains(val)) {
                sumNums -= val;
            } else {
                set.add(val);
                sumNums += val;
            }
        }
        return sumNums;
    }
}
