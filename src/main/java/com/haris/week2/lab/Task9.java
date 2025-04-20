package com.haris.week2.lab;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a base number: ");
        int base = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter a exponent number: ");
        int exponent = Integer.parseInt(scanner.nextLine());

        System.out.println(power(base, exponent));
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
