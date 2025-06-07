package com.haris.week15.abstraction;

public class Abstraction {
    public static void main(String[] args) {
        OnlineSubscription netflixSubscription = new OnlineSubscription("Netflix");

        netflixSubscription.renewSubscription(5);
        System.out.println("Active months: " + netflixSubscription.getActiveMonths());
        netflixSubscription.renewSubscription(10);
        System.out.println("Active months: " + netflixSubscription.getActiveMonths());
    }
}
