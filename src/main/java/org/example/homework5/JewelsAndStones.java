package org.example.homework5;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char s : stones.toCharArray()) {
            if (jewels.indexOf(s) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        numJewelsInStones(jewels, stones);

    }
}
