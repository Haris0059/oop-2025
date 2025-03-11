package com.haris.week2.lab;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of rows/columns: ");
        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 != 0) {
            printDiamond(number);
        } else {
            System.out.println("Number is even!");
        }

    }

    public static void printDiamond(int n) {
        for (int i = 1; i <= n; i += 2) {
            printRow(n, i);
        }

        for (int i = n - 2; i >= 1; i -= 2) {
            printRow(n, i);
        }
    }

    public static void printRow(int n, int stars) {
        int spaces = (n - stars) / 2;

        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
