package com.haris.week4.lab;

import java.util.ArrayList;
import java.util.Collections;

class Group {

    private ArrayList<Person> group;

    public Group (ArrayList<Person> group) {
        this.group = group;
    }

    public void addPerson(Person person) {
        group.add(person);
    }

    public void listPeople() {
        for (Person person : this.group) {
            System.out.println(person);
        }
    }

    public void removePerson(String name) {
        for(int i = this.group.size() - 1; i >= 0; i--) {
            if (this.group.get(i).getName().equals(name)) {
                this.group.remove(i);
            }
        }
    }
}

class Task2 {
    //Removing Objects from a List
    //Implement removePerson(String name).
    //Test adding/removing people dynamically.

    public static void main(String[] args) {
        Person haris = new Person("Haris", 19);
        Person kerim = new Person("Kerim", 19);
        Person kiram = new Person("Kiram", 19);
        Person emina = new Person("Emina");

        ArrayList<Person> students = new ArrayList<>();
        Collections.addAll(students, haris, kiram, kerim);

        Group studentsGroup = new Group(students);
        studentsGroup.addPerson(emina);
        studentsGroup.listPeople();
        studentsGroup.removePerson("Haris");
        System.out.println();
        studentsGroup.listPeople();
    }
}
