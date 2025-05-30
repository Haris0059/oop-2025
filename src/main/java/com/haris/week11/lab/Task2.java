package com.haris.week11.lab;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task2 {
    //In main():
    //Print the full name of the class of a given object.
    //List and display all fields (name, type, and access level).
    //List and display all methods (name, return type, and parameters).
    //Modify the private final field name and show the change.
    //Modify the value of age.
    //Invoke:
    //A public method with no arguments.
    //A public method with a parameter.
    //A private method.
    //A static method
    //Rules:
    //- Do not access any field or method directly.
    //- Only use reflection to explore and manipulate.
    //- Handle any exceptions properly

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Dog dog = new Dog("Max", 7);
        Class<?> dogClass = dog.getClass();
        Method[] methods = dogClass.getDeclaredMethods();
        Field[] fields = dogClass.getDeclaredFields();

        System.out.println("Class name: ".concat(dogClass.getName()));

        System.out.println("\nFields: ");
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getType().getSimpleName() + " " + field.getName() + ": " + field.get(dog));
        }

        System.out.println("\nMethods: ");
        for (Method method : methods) {
            method.setAccessible(true);
            System.out.print(method.getReturnType().getSimpleName() + " " + method.getName() + " (");
            Class<?>[] parameters = method.getParameterTypes();
            for (int i = 0; i < parameters.length; i++) {
                System.out.print(parameters[i].getSimpleName() );
                if (i < parameters.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }
    }
}
