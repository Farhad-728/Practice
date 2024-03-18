package org.example.homework5;

public class NumberEmployeesWhoMettheTarget {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int val : hours) {
            if (val >= target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] hours = {0, 1, 2, 3, 4};
        int target = 2;
        numberOfEmployeesWhoMetTarget(hours, target);

    }
}
