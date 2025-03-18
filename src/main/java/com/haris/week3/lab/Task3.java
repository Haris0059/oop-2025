package com.haris.week3.lab;

public class Task3 {
    // Write a Java program with the following methods:
    //printMessage(String message): Prints the given message.
    //multiply(int a, int b): Returns the product of two integers.
    //isEven(int num): Returns true if the number is even, otherwise false.

    public static void main(String[] args) {
        printMessage("Hello world!");
        System.out.println(multiply(5,4));
        System.out.println(isEven(5));
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0)
            return true;
        return false;
    }
}
