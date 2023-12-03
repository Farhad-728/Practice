package org.example.homework2;

import java.util.LinkedList;
import java.util.List;

public class LinkedList2App {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(33);
        nums.add(22);
        nums.add(5);
        nums.add(18);
        nums.add(1);

        System.out.println("Original numbers: " + nums);

        List<Integer> subList = nums.subList(1, 3);

        nums.subList(1, 3);

        System.out.println("SubList numbers: " + subList);
    }
}
