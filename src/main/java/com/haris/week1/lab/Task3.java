package com.haris.week1.lab;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s! You are future Java ninja,", name);
    }
}
