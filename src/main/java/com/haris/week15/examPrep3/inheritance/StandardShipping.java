package com.haris.week15.examPrep3.inheritance;

public class StandardShipping extends Shipping {
    private double distance;

    public StandardShipping(double baseFee, double weight, double distance) {
        super(baseFee, weight);
        this.distance = distance;
    }

    @Override
    public double calculateFee() {
        return this.getBaseFee() + (this.getWeight() * 2) + (this.getDistance() * 0.5);
    }

    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
}
