package com.haris.week15.inheritance;

public class StreamingService extends Service {
    private int subscriptionLength;

    public StreamingService(String name, int baseFee, int subscriptionLength) {
        super(name, baseFee);
        this.subscriptionLength = subscriptionLength;
    }

    @Override
    public double calculateFee() {
        return this.getBaseFee() * this.subscriptionLength * 1.05;
    }

    public int getSubscriptionLength() {
        return subscriptionLength;
    }
    public void setSubscriptionLength(int subscriptionLength) {
        this.subscriptionLength = subscriptionLength;
    }
}
