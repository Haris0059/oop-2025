package com.haris.week1.lab;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username;
        String password;
        String rightUsername = "admin";
        String rightPassword = "1234";

        System.out.print("Username: ");
        username = scanner.nextLine();

        System.out.print("Password: ");
        password = scanner.nextLine();

        if (username.equals(rightUsername) && password.equals(rightPassword))
            System.out.println("Welcome, Admin!");
        else
            System.out.println("Access Denied!");
    }
}
