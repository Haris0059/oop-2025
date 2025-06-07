package com.haris.week15.examPrep1.abstraction;

public class OnlineSubscription extends SubscriptionManager {
    private int activeMonths;
    private String serviceName;

    public OnlineSubscription(String serviceName) {
        this.serviceName = serviceName;
        this.activeMonths = 0;
    }

    public int getActiveMonths() {
        return this.activeMonths;
    }

    @Override
    public void renewSubscription(int months) {
        this.activeMonths += months;
        System.out.printf("Subscription for %s renewed for %d months.\n", this.serviceName, months);
    }
}
