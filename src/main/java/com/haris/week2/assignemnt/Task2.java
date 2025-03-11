package com.haris.week2.assignemnt;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // FizzBuzz - print FizzBuzz if number % 15 == 0,
        // if number % 3 == 0 print Fizz,
        // if number % 5 == 0 print Buzz,
        // else print number

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (bigger then 1): ");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
