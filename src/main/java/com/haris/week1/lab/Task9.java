package com.haris.week1.lab;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter a number: ");
        int b = Integer.parseInt(scanner.nextLine());

        if (a == b) {
            System.out.println("They are equal!");
        } else if (a > b) {
            System.out.println(a + " is greater!");
        } else {
            System.out.println(b + " is greater!");
        }
    }
}
