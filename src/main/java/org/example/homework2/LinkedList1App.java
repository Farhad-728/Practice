package org.example.homework2;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1App {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(25);
        numbers.add(16);
        numbers.add(14);
        numbers.add(21);
        numbers.add(2);
        numbers.add(33);
        numbers.add(19);
        numbers.add(55);
        System.out.println("1. " + numbers);

        numbers.remove(9);
        numbers.removeLast();

        numbers.set(0, 77);

        numbers.get(numbers.size() / 2);


        System.out.println("2. " + numbers);
    }
}
