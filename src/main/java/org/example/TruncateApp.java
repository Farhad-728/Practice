package org.example;

public class TruncateApp {

    public static String truncate(String s, int k) {
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
        String text = "Hello how are you Contestant";
        int k = 4;

        String truncateSentence = truncate(text, k);
        System.out.println(truncateSentence);
    }
}
