package org.example.homework2;

public class ReverseArrayApp {
    public static void reverseArray(String[] arr) {

        int left = 0;
//        int right = arr.length - 1;


        while (left < (arr.length - left) - 1) {

            swap(arr, left);

            left++;

        }
    }

    public static void swap(String[] arr, int left) {
        String temp = arr[left];
        arr[left] = arr[arr.length - left - 1];
        arr[arr.length - left - 1] = temp;

        String[] array = {"Samir"};
        arr = array;

    }

    public static void main(String[] args) {
        String[] array = {"Adil", "Beshir", "Subhan", "Derya", "Farhad"};

        reverseArray(array);

        for (String newArray : array) {
            System.out.print(newArray + " ");
        }

    }
}

