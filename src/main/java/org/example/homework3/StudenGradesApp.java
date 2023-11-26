package org.example.homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudenGradesApp {
    private static HashMap<String, List<Integer>> students = new HashMap<>(30);

    public static void main(String[] args) {
        StudenGradesApp grades = new StudenGradesApp();
        grades.addGrade("John", 85);
        grades.addGrade("Emily", 78);
        grades.addGrade("John", 92);
        grades.addGrade("Emily", 80);
        System.out.println("Student Grades:");
        grades.printGrades();
        grades.averageGrade();

    }

    private void addGrade(String name, int grade) {
        students.putIfAbsent(name, new ArrayList<>());
        students.get(name).add(grade);

    }

    private void averageGrade() {
        System.out.println("Average Grades:");
        for (Map.Entry<String, List<Integer>> entry : students.entrySet()) {
            String name = entry.getKey();
            List<Integer> grades = entry.getValue();
            double average = calcuateAverage(grades);
            System.out.println(name + ": " + average);
        }
    }

    private static double calcuateAverage(List<Integer> grades) {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = grades.stream().mapToInt(Integer::intValue).sum();
        return (double) sum / grades.size();
    }

    private void printGrades() {
        for (Map.Entry<String, List<Integer>> student : students.entrySet()) {
            String key = student.getKey();
            List<Integer> value = student.getValue();
            System.out.println(key + value);
        }
    }
}
