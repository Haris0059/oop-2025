package com.haris.week1.lab;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a temperature (in Celsius): ");
        double temperature = Double.parseDouble(scanner.nextLine());

        double converted = temperature * 9 / 5 + 32;
        System.out.println(converted);
    }
}
