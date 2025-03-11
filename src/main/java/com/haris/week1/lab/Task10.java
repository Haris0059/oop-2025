package com.haris.week1.lab;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = Integer.parseInt(scanner.nextLine());

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("This is leap year!");
        } else {
            System.out.println("This is not a leap year");
        }
    }
}
