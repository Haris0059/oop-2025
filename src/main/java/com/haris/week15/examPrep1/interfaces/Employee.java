package com.haris.week15.examPrep1.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Employee implements Trainable, Expense{
    private static HashMap<String, List<Double>> expenses = new HashMap<>();

    @Override
    public void recordExpense(String date, double amount) {
        if (!expenses.containsKey(date)) {
            expenses.put(date, new ArrayList<>());
        }
        expenses.get(date).add(amount);
    }

    @Override
    public void enroll() {
        System.out.println("Employee enrolled in training.");
    }

    public double getTotalExpense(String date) {
        if (expenses.containsKey(date)) {
            List<Double> doubles = expenses.get(date);
            double sum = 0;
            for (Double number : doubles) {
                sum += number;
            } return sum;
        } return 0;
    }
}
