package com.haris.week1.lab;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }
}
