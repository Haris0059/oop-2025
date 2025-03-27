package com.haris.week4.lab;

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid Age, number must be greater than 0");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void increaseAge() {
        this.age++;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }
}

class Task1 {
    public static void main(String[] args) {
        Person haris = new Person("Haris");
        Person ajla = new Person("Ajla", 22);

        System.out.println(haris.getName());
        System.out.println(haris.getAge());
        System.out.println(ajla.getName());
        System.out.println(ajla.getAge());

        haris.setAge(19);
        System.out.println(haris.getAge());
        haris.increaseAge();
        haris.increaseAge();
        haris.increaseAge();
        System.out.println(haris.getAge());
        System.out.println(haris.isAdult());
        System.out.println(haris);
        System.out.println(ajla);
        haris.setAge(-15);
    }
}
