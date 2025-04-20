package com.haris.week7.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    abstract int calculateBonus();

    public String getDetails() {
        return "name: " + this.getName() + ", salary: " + this.getSalary();
    }
}

interface Reportable {
    String generateReport();
}

class Developer extends Employee implements Reportable{
    private String programmingLanguage;
    private final int bonus = 20;

    public Developer(String name, int salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    int calculateBonus() {
        return this.getSalary() * this.bonus/100;
    }

    @Override
    public String generateReport() {
        return "name: " + this.getName() + ", salary" + this.getSalary() + ", bonus:" + this.calculateBonus();
    }
}

class Manager extends Employee implements Reportable{
    private int teamSize;
    private final int bouns = 30;

    public Manager(String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getBouns() {
        return bouns;
    }

    @Override
    int calculateBonus() {
        return this.getSalary() * this.bouns/100;
    }

    @Override
    public String generateReport() {
        return "name: " + this.getName() + ", salary" + this.getSalary() + ", bonus:" + this.calculateBonus();
    }
}

class Task4 {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Developer haris = new Developer("Haris",125000, "Java");
        Manager lejla = new Manager("Lejla", 101000,5);

        Collections.addAll(employees,haris,lejla);

        for (Employee employee : employees) {
            System.out.println(employee.calculateBonus());

            if (employee instanceof Developer) {
                Developer developer = (Developer) employee;
                System.out.println(developer.generateReport());
            } else {
                Manager manager = (Manager) employee;
                System.out.println(manager.generateReport());
            }
        }
    }


    //	In main:
    //Store them in an arraylist of Employee
    //Call generateReport for both
    //Call CalculateBonus for both
}
