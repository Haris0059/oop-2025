package com.haris.week1.lab;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
