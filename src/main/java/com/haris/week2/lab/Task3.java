package com.haris.week2.lab;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        collatzSteps(number);
    }

    public static void collatzSteps(int n) {
        while (n != 1) {
            System.out.print(n + " -> ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        System.out.println("1");
    }
}
