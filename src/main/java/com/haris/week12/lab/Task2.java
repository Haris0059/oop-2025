package com.haris.week12.lab;

public class Task2 {
    //You're writing a validation utility for user registration.
    //Tasks:
    //Create a class Validator with:
    //public void validateAge(int age) throws InvalidAgeException
    //Throws custom exception if age < 0.
    //Create custom exception InvalidAgeException
    //In main():
    //Call validateAge() with both valid and invalid inputs.
    //Use try-catch to print a custom error message when an exception is thrown.

    public static void main(String[] args) {
        Validator validator = new Validator();

        try {
            validator.valdiateAge(100);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: ".concat(e.getMessage()));
        }
    }
}
