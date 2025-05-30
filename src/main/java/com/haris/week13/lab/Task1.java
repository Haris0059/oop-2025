package com.haris.week13.lab;

import com.mysql.cj.log.Log;

public class Task1 {
    //You are building a centralized logger system for your application.
    //Tasks:
    //Create a Logger class:
    //Make the constructor private.
    //Implement a static getInstance() method that returns a single instance.
    //Create a log(String message) method that prints messages with a timestamp.
    //String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    //In main():
    //Retrieve the logger instance multiple times.
    //Verify that all calls return the same instance.
    //Log a few messages and observe the output.
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();

        if (logger.equals(logger1)) {
            System.out.println("They are same");
        } else {
            System.out.println("They are not the same");
        }

        logger.log("hi");
        logger.log("test123");
    }
}
