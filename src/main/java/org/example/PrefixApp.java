package org.example;

public class PrefixApp {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (String word : strs) {

            while (!word.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight", };
        System.out.println(longestCommonPrefix(words));
    }
}
