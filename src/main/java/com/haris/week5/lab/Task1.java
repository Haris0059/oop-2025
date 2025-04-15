package com.haris.week5.lab;

import java.util.ArrayList;
import java.util.Collections;

class Person {
    private String name;
    private String email;
    private int birthYear;

    public Person(String name, String email, int birthYear) {
        this.name = name;
        this.email = email;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge(int currentYear) {
        return currentYear - birthYear;
    }

    public String getInfo() {
        return "Name: " + this.name + ", Birth Year: " + this.birthYear + ", Email: " + this.email;
    }
}

class Student extends Person {
    private String studentId;
    private String major;

    public Student(String name, String email, int birthYear, String studentId, String major) {
        super(name, email, birthYear);
        this.studentId = studentId;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getInfo() {
        return super.getInfo() + "Student Id: " + this.studentId + ", Major: " + this.major;
    }
}

class Professor extends Person {
    private String employeeId;
    private String department;

    public Professor(String name, String email, int birthYear, String employeeId, String department) {
        super(name, email, birthYear);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Employee Id: " + this.employeeId + ", Department: " + this.department;
    }
}

class Task1 {

    public static void main(String[] args) {
        Student haris = new Student("Haris", "haris.skeledzija@stu.ibu.edu.ba", 2005, "24004880", "Information Technology");
        Professor becir = new Professor("Becir", "becir@ibu.edu.ba", 1994, "Something", "Information Technology");
        ArrayList<Person> persons = new ArrayList<>();
        Collections.addAll(persons, haris, becir);
        for(Person person : persons) {
            System.out.println(person.getInfo());
        }
    }

}
