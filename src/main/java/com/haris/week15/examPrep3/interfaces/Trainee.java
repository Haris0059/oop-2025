package com.haris.week15.examPrep3.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Trainee implements Trackable, Trainable{
    private HashMap<String, List<Integer>> storage;

    public Trainee(HashMap<String, List<Integer>> storage) {
        this.storage = storage;
    }

    @Override
    public void enrollInCourse(String courseName) {
        System.out.printf("Trainee enrolled in course: %s.%n", courseName);
    }

    @Override
    public void recordSession(String date, int duration) {
        if (!storage.containsKey(date)) {
            storage.put(date, new ArrayList<>());
        } storage.get(date).add(duration);
    }

    public int getTotalSessionTime(String date) {
        int sessionTime = 0;

        if (storage.containsKey(date)) {
            List<Integer> durationList = storage.get(date);

            for (Integer num : durationList) {
                sessionTime += num;
            }
        }

        return sessionTime;
    }

    public HashMap<String, List<Integer>> getStorage() {
        return storage;
    }
    public void setStorage(HashMap<String, List<Integer>> storage) {
        this.storage = storage;
    }

}
