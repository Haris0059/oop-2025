package com.haris.week2.lab;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 0) {
            System.out.println("Only accepting natural numbers!");
        } else {
            System.out.println(sumNatural(number));
        }
    }

    public static int sumNatural(int num) {
        int sum = 0;
        for (int i = num; i > 0; i--) {
            sum += i;
        }
        return sum;
    }
}
