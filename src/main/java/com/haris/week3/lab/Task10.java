package com.haris.week3.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task10 {
    // Create a method that will receive an ArrayList<Integer> of five random numbers as a parameter.
    // Sort the list in ascending order. Remove all even numbers from the list. Return updated ArrayList.

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        /*for (int i = 0; i < 5; i++) {
            int number = random.nextInt();
            numbers.add(number);
        }*/
        Collections.addAll(numbers, 2, 4, 6, 5, 10);
        System.out.println(numbers);
        System.out.println(sortRemoveReturn(numbers));
    }

    public static ArrayList<Integer> sortRemoveReturn(ArrayList<Integer> list) {
        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        return list;
    }
}
