package com.haris.week2.lab;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter a number: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(findGCD(a, b));
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
