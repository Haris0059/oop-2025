package com.haris.week13.lab;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivers via water");
    }
}
