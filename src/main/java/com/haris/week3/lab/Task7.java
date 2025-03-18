package com.haris.week3.lab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task7 {
    // Create a method that will receive an ArrayList of student names
    // and sort the student list in alphabetical order and print out all students names.

    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Collections.addAll(studentNames, "Haris", "Ajla", "Becir", "Kerim", "Edin");

        sortAndPrint(studentNames);
    }

    public static void sortAndPrint(ArrayList<String> studentNames) {
        Collections.sort(studentNames);

        for (String student : studentNames) {
            System.out.println(student);
        }
    }
}
