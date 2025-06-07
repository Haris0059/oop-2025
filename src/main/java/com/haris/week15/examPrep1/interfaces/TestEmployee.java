package com.haris.week15.examPrep1.interfaces;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.enroll();

        employee.recordExpense("23.04.2005", 25.4);
        employee.recordExpense("23.04.2005", 500);
        employee.recordExpense("20.02.2022", 1);
        System.out.println(employee.getTotalExpense("23.04.2005"));
        System.out.println(employee.getTotalExpense("01.01.1001"));
    }
}
