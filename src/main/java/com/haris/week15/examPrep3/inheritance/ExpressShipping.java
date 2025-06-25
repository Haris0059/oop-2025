package com.haris.week15.examPrep3.inheritance;

public class ExpressShipping extends Shipping{
    private int priorityLevel;

    public ExpressShipping(double baseFee, double weight, int priorityLevel) {
        super(baseFee, weight);
        this.priorityLevel = priorityLevel;
    }

    @Override
    public double calculateFee() {
        return this.getBaseFee() + (this.getWeight() * 3) + (this.getPriorityLevel() * 10);
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }
    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
}
