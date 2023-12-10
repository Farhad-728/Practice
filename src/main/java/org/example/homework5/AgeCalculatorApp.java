package org.example.homework5;

import java.time.LocalDate;

import java.time.Period;

public class AgeCalculatorApp {
    public static void main(String[] args) {


        LocalDate bDay = LocalDate.of(1987, 9, 9);
        Period age = Period.between(bDay, LocalDate.of(2024, 1, 10));

        int thisYear = age.getYears();
        int thisMonth = age.getMonths();

        System.out.println(thisYear);
        System.out.println(thisMonth);
    }
}
