package com.haris.week3.lab;

import java.util.Scanner;

public class Task11 {
    // Create an enum called Day with values: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
    // Implement a method isWeekend(Day day) that checks whether a given day is a weekend.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a day of the week: ");
            String inputDay = scanner.nextLine().toUpperCase();

            Day day = Day.valueOf(inputDay);
            isWeekend(day);
        } catch (IllegalArgumentException e) {
            System.out.println("Enter a valid day of the week!");
        }



    }

    public static void isWeekend(Day day) {
        if (day.equals(Day.SUNDAY) || day.equals(Day.SATURDAY)) {
            System.out.println("It is the weekend!!");
        } else {
            System.out.println("It is a work day... ;(");
        }
    }
}
