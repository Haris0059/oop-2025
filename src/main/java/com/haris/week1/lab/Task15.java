package com.haris.week1.lab;

import java.util.Random;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(1,101);

        while (true) {
            System.out.print("Enter a guess (1-100): ");
            int guess = Integer.parseInt(scanner.nextLine());

            if (guess == randomNumber) {
                System.out.println("Woah, you did it. Congrats!");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else  {
                System.out.println("Too high! Try again.");
            }
        }
    }
}
