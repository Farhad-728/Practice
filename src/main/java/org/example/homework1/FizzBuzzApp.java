package org.example.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzApp {
    public static String[] fizzBuzz(int n) {

        String[] localArray = new String[n];

//        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                localArray[i - 1] = "FizzBuzz";

            } else if (i % 3 == 0) {
                localArray[i - 1] = "Fizz";

            } else if (i % 5 == 0) {
                localArray[i - 1] = "Buzz";

            } else {
                localArray[i - 1] = Integer.toString(i);
            }
        }
        return localArray;
    }

    public static void main(String[] args) {
        int n = 15;
//        String[] result = fizzBuzz(n).toString();
//
//
//        for (String element : result) {
//            System.out.print(element + " ");
//        }
    }
}

