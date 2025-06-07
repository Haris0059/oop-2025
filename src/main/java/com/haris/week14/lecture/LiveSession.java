package com.haris.week14.lecture;

public class LiveSession {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Multithreading thread = new Multithreading(i);
            Thread threadRunnable = new Thread(thread);
            threadRunnable.start();
        }
    }
}
