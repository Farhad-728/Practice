package org.example.homework3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicatesFromListApp {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(22, 32, 12, 21, 33, 22, 21, 54, 22);
        removeDublicate(numbers);
    }

    private static void removeDublicate(List<Integer> nums) {
        Set<Integer> uniqSet = new HashSet<>(nums);

        System.out.println(uniqSet);
    }

}
