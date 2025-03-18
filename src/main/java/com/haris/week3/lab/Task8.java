package com.haris.week3.lab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task8 {
    //Implement a method searchStudent(ArrayList<String> list, String name) to check if a name exists in the list.

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Haris", "Edin", "Selvedina", "BlaBla");

        searchStudent(list,"ris");
    }

    public static void searchStudent(ArrayList<String> list, String name) {
        if (list.contains(name)) {
            System.out.println("This list contains: " + name);
        }
    }
}
