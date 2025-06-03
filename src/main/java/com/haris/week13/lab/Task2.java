package com.haris.week13.lab;

public class Task2 {
    //You are constructing a pizza ordering system with customizable options.
    //Tasks:
    //Create a Pizza class with fields: size, cheese, pepperoni, and bacon.
    //Create a static inner Builder class:
    //Methods to set each field (e.g., addCheese(), addPepperoni()).
    //build() method that returns the constructed Pizza object.
    //In main():
    //Use the builder to create different pizza configurations.
    //Print their details.

    public static void main(String[] args) {
        Pizza margarita = new Pizza.PizzaBuilder()
                .setSize("Large")
                .setCheese(true)
                .build();
    }
}
