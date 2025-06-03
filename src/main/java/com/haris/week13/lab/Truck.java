package com.haris.week13.lab;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivers via road");
    }
}
