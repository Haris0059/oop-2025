package com.haris.week3.lab;

public class Task4 {

    // Create three overloaded (method with different signatures) methods printDetails():
    //One that accepts a String name and prints “Hi, My name is [name]”.
    //One that accepts a String name and an int age and prints “Hi, My name is [name] and I am [age] years old”.
    //One that accepts a String name, an int age, and a String city and prints “Hi, My name is [name] and I am [age] years old and I am coming from [city]”.

    public static void main(String[] args) {
        printDetails("Haris");
        printDetails("Haris", 19);
        printDetails("Haris", 19, "Visoko");
    }

    public static void printDetails(String name) {
        System.out.printf("Hi, My name is %s\n", name);
    }

    public static void printDetails(String name, int age) {
        System.out.printf("Hi, My name is %s and I am %d years old\n", name, age);
    }

    public static void printDetails(String name, int age, String city) {
        System.out.printf("Hi, My name is %s and I am %d years old and I am from %s\n", name, age, city);
    }
}
