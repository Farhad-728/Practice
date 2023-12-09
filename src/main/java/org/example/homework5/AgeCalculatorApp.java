package org.example.homework5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class AgeCalculatorApp {
    public static void main(String[] args) {

        LocalDate bDay = LocalDate.of(1987, 9, 9);
        int thisYear = LocalDate.now().getYear();
        Month thisMonth = LocalDate.now().getMonth();
        int year = thisYear - bDay.getYear();
//        int month = thisMonth - bDay.getMonthValue();
        System.out.println(year);
        System.out.println();
    }
}
