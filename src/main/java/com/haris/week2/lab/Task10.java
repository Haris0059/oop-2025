package com.haris.week2.lab;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(sumDigits(number));
    }

    public static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            sum += digit;
        }
        return sum;
    }
}
