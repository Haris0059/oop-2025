package com.haris.week3.lab;

import java.util.ArrayList;

public class Task5 {
    // Implement a method generateNumbers(int n) that returns an ArrayList<Integer> with the first n natural numbers.

    public static void main(String[] args) {
        System.out.println(generateNumbers(5));
    }

    public static ArrayList<Integer> generateNumbers(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        return numbers;
    }
}
