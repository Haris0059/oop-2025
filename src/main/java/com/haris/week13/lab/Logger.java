package com.haris.week13.lab;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        synchronized (Logger.class) {
            if (instance == null) {
                instance = new Logger();
            } return instance;
        }
    }

    public void log(String message) {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String result = "[" + timeStamp + "] " + message;
        System.out.println(result);
    }
}
