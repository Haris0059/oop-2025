package com.haris.week14.lecture;

public class Multithreading implements Runnable {
    private int threadNumber;

    public Multithreading(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + this.threadNumber + ": " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

}
