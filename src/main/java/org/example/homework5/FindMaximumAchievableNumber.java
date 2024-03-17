package org.example.homework5;

public class FindMaximumAchievableNumber {
    public static int theMaximumAchievable(int num, int t) {
        return num + (t*2);

    }

    public static void main(String[] args) {
        int num = 5, t = 4;
        System.out.println(theMaximumAchievable(num, t));
    }
}
