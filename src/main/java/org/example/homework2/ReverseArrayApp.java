package org.example.homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayApp {
    public static void reverseArray(String[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }
    }

    public static void main(String[] args) {
        String[] array = {"Adil", "Beshir", "Subhan", "Derya"};

        reverseArray(array);

        for (String newArray : array) {
            System.out.print(newArray + " ");
        }

    }
}

