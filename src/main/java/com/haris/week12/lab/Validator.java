package com.haris.week12.lab;

public class Validator {
    public void valdiateAge(int age) {
        if (age < 0)
            throw new InvalidAgeException("Age can't be smaller then 0");
        else if (age > 100)
            throw new InvalidAgeException("Age can't be greater then 100");
    }
}
