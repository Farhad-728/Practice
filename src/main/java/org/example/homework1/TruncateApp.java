package org.example.homework1;

public class TruncateApp {

    public static String truncate(String s, int k) {
        if (s.isEmpty()) {
            return "";
        }
        int i;
        for (i = 0; i < s.length() && k > 0; i++) {
            if (s.charAt(i) == ' ') {
                k--;
            }
        }
        return i == s.length() ? s.substring(0, i) : s.substring(0, i - 1);

    }
//        String[] words = s.split(" ");
//
//        if (k >= words.length) {
//            return s;
//        } else {
//            StringBuilder truncateSentence = new StringBuilder();
//            for (int i = 0; i < k; i++) {
//                truncateSentence.append(words[i]);
//                if (i < k - 1) {
//                    truncateSentence.append(" ");
//                }
//            }
//            return truncateSentence.toString();
//        }
//    }

    public static void main(String[] args) {
        String text = "Hello how are you Contestant";
        int k = 4;

        String truncateSentence = truncate(text, k);
        System.out.println(truncateSentence);
    }
}
