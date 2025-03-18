package com.haris.week3.lab;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {

    //Create a method that will:
    //Create an ArrayList<String> of student names.
    //Add five names to the list.
    //Remove a specific name.
    //Print all names using:
    //A for loop
    //A for-each loop
    //A while loop

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a student name: ");
            studentNames.add(scanner.nextLine());
        }

        studentNames.remove("Haris");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i));
        }

        for (String studentName : studentNames) {
            System.out.println(studentName);
        }
        int i = 0;

        while  (i < studentNames.size()) {
            System.out.println(studentNames.get(i));
            i++;
        }
    }
}
