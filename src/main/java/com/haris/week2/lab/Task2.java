package com.haris.week2.lab;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        while (number > 9) {
            number = sumOfDigits(number);
        }
        System.out.println(number);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            sum += digit;
        }
        return sum;
    }
}
