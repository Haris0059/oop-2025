package com.haris.week2.assignemnt;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (bigger than 1): ");
        int number = Integer.parseInt(scanner.nextLine());

        triangle1(number);
        System.out.println();
        triangle2(number);
        System.out.println();
        triangle3(number);
        System.out.println();
        triangle4(number);
    }

    public static void triangle1(int number) {
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void triangle2(int number) {
        for (int i = 1; i <= number; i++) {

            for (int j = 0; j <= (number - i); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void triangle3(int number) {
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void triangle4(int number) {
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= (number - i); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}