package com.haris.week3.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task9 {
    // Write a method getRandomStudent(ArrayList<String> list) that randomly selects a student.
    // Use Random to generate an index. Call the method multiple times to check randomness.

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Haris", "Edin", "Ajla", "Selvedina");

        for (int i = 0; i < 5; i++) {
            System.out.println(getRandomStudent(list));
        }
    }

    public static String getRandomStudent(ArrayList<String> list) {
        Random random = new Random();
        int randomNumber = random.nextInt(list.size());
        return list.get(randomNumber);
    }
}
