package com.haris.week1.lab;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 10; i > 0; i--) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
