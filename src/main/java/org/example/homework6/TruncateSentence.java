package org.example.homework6;

public class TruncateSentence {
    public static String truncateSentence(String s, int k) {
        String[] words = s.split(" ");

        if (k >= words.length) {
            return s;
        } else {
            StringBuilder truncateSentence = new StringBuilder();
            for (int i = 0; i < k; i++) {
                truncateSentence.append(words[i]);
                if (i < k - 1) {
                    truncateSentence.append(" ");
                }
            }
            return truncateSentence.toString();
        }
    }
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 3;
        truncateSentence(s, k);
    }
}
