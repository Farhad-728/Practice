package org.example.homework1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagramApp {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char key : s.toCharArray()) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        for (char key : t.toCharArray()) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) - 1);
            } else {
                map.put(key, -1);
            }
        }
        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        Boolean result = isAnagram(s, t);
        System.out.println(result);
    }
}
