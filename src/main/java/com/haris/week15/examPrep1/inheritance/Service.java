package com.haris.week15.examPrep1.inheritance;

public abstract class Service {
    private String name;
    private int baseFee;

    public Service(String name, int baseFee) {
        this.name = name;
        this.baseFee = baseFee;
    }

    public double calculateFee() {
        return 0.0;
    }

    public String getName() {
        return name;
    }
    public Service setName(String name) {
        this.name = name;
        return this;
    }

    public int getBaseFee() {
        return baseFee;
    }
    public Service setBaseFee(int baseFee) {
        this.baseFee = baseFee;
        return this;
    }
}
