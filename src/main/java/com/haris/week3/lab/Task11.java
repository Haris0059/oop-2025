package com.haris.week3.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task11 {
    // Create a method that will receive an ArrayList<Integer> of five random numbers as a parameter.
    // Sort the list in ascending order. Remove all even numbers from the list. Return updated ArrayList.

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int number = random.nextInt();
            numbers.add(number);
        }

        System.out.println(sortRemoveReturn(numbers));
    }

    public static ArrayList<Integer> sortRemoveReturn(ArrayList<Integer> list) {
        Collections.sort(list);
        for (Integer number : list) {
            if (number % 2 == 0) {
                list.remove(number);
            }
        }
        return list;
    }
}
