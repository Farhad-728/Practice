package org.example;

public class ReverseStringApp {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char result = s[left];
            s[left] = s[right];
            s[right] = result;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseString(s);

        for (char c : s) {
            System.out.print(c + " ");
        }
    }
}