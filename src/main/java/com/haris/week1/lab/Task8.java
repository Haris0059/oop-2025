package com.haris.week1.lab;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        if (age > 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are to young to vote!");
        }
    }
}
