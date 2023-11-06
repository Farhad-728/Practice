package org.example;

public class FindIndexFirstOccurrenceApp {

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        int result = strStr(haystack, needle);
        System.out.println(result);
    }
}
