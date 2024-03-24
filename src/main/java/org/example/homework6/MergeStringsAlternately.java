package org.example.homework6;

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        int i = 0, j = 0;
        int n = word1.length(), m = word2.length();
        while (i < n || j < m) {
            if (i < n) {
                merge.append(word1.charAt(i++));
            } if (j < m) {
                merge.append(word2.charAt(j++));
            }
        }

        return merge.toString();
    }

    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqr";
        mergeAlternately(word1, word2);
    }
}
