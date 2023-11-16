package org.example.homework2;

import java.util.ArrayList;

public class IntegerArrayListApp {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(22);
        numbers.add(10);
        numbers.add(21);
        numbers.add(11);
        numbers.add(5);
        numbers.add(12);
        numbers.add(3);
        numbers.add(8);
        System.out.println("1. " + numbers);

        if (numbers.contains(5)) {
            System.out.println("2. " + "The ArrayList has 5 elements.");
        } else {
            System.out.println("2. " + "The ArrayList does not have 5 elements.");
        }
        for (int n = 0; n < numbers.size(); n++) {
            if (numbers.contains(8)) {
                System.out.println("3. Index of element 8: " + numbers.indexOf(8));
                break;
            }
        }

        numbers.removeIf(even -> even % 2 == 0);
        numbers.set(0, 0);

        System.out.println("4.New list: " + numbers);
    }
}


