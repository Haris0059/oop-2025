package com.haris.week1.lab;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password;
        String rightPassword = "JavaRocks";

        System.out.print("Password: ");
        password = scanner.nextLine();

        if (password.equals(rightPassword)) {
            System.out.println("Access Granted!");
        } else {
            System.out.println("Access Denied!");
        }
    }
}
