package org.example.homework6;

public class ReverseWordsString {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            String reversedWord = reverseWord(word);
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    private static String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers inward
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        reverseWords(s);

    }
}
