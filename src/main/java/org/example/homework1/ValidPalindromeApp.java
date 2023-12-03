package org.example.homework1;

public class ValidPalindromeApp {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-z0-9]", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(text);
        System.out.println(result);
    }
}
