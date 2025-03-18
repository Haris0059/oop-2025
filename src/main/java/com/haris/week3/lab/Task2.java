package com.haris.week3.lab;

import java.sql.SQLException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        Db db = new Db();

        System.out.print("Enter a day of the week: ");
        String day = scanner.nextLine();

        db.getScheduleByDay(day);
    }
}
