package com.haris.week2.lab;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(countDigits(number));
    }

    public static int countDigits(int n) {
        return Integer.toString(n).length();
    }
}
