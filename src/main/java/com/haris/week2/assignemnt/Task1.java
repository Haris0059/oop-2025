package com.haris.week2.assignemnt;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Iterate through numbers from n to 1, but if numbers is % 2 then / 2, else - 5

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (bigger then 1): ");
        int number = Integer.parseInt(scanner.nextLine());

        if (number < 1) {
            System.out.println("Number can't be smaller then 1");
        } else {
            for (int i = 1; i <= number; number--) {
                if (number % 2 == 0) {
                    System.out.println(number / 2);
                } else {
                    System.out.println(number - 5);
                }
            }
        }
    }
}