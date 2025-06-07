package com.haris.week15.examPrep2.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

public class Employee implements Assignable,Workable{
    private HashMap<String, List<Double>> dataStorage;

    @Override
    public void assignProject(String projectName) {
        System.out.printf("Employee assigned to project: %s.%n", projectName);
    }

    @Override
    public void logWorkHours(String date, double hours) {
        if (!dataStorage.containsKey(date)) {
            dataStorage.put(date, new ArrayList<>());
        }

        dataStorage.get(date).add(hours);
    }

    public double getTotalWorkHours(String date){
        if (!dataStorage.containsKey(date)) {
            throw new NoSuchElementException();
        }

        double result = 0;

        List<Double> hours = dataStorage.get(date);
        for (double hour : hours) {
            result += hour;
        }

        return result;
    }
}
