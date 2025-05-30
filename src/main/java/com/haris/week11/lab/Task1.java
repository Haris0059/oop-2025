package com.haris.week11.lab;

import java.lang.reflect.Method;

public class Task1 {
    public static void main(String[] args) {
        ProjectTasks projectTasks = new ProjectTasks();
        Method[] methods = projectTasks.getClass().getDeclaredMethods();

        for(Method method : methods) {
            if (method.isAnnotationPresent(TrackTask.class)) {
                TrackTask annotation = method.getAnnotation(TrackTask.class);
                String assignedTo = annotation.assignedTo();
                int priority = annotation.priority();

                System.out.println("Method: " + method.getName());
                System.out.println("Assigned developer: ".concat(assignedTo));
                System.out.println("Priority level: ".concat(priorityString(priority)));
                System.out.println();

                if (priority == 3 &&
                        !(method.getName().toLowerCase().contains("critical") ||
                        method.getName().toLowerCase().contains("important"))) {
                    System.out.println("Warning: Method " + method.getName() +
                            " has high priority but is not labeled as 'Critical' or 'Important'");
                    System.out.println();
                }
            }
        }
    }

    public static String priorityString (int priority) {
        if (priority == 3)
            return "HIGH";
        else if (priority == 2)
            return "MEDIUM";
        else
            return "LOW";
    }
}
