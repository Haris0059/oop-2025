package com.haris.week15.examPrep1.designPatterns;

public class Test {
    public static void main(String[] args) {
        Vehicle golf = new Vehicle.VehicleBuilder("Golf 7")
                .setYear(2014)
                .build();
    }
}
