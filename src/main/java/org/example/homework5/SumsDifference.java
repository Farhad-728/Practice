package org.example.homework5;

public class SumsDifference {
    public static int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m != 0) {
                num1 += i;
            } else {
                num2 += i;
            }
        }
        return num1 - num2;
    }

    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        differenceOfSums(n,m);
    }
}
