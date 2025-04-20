package com.haris.week7.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return this.getRadius() * 3.14;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double getArea() {
        return this.getHeight() * this.getWidth();
    }
}

class Task3 {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Circle krug = new Circle("red", 5);
        Rectangle pravugaonik = new Rectangle("black", 3, 5);

        Collections.addAll(shapes, krug, pravugaonik);

        for (Shape shape : shapes) {
            System.out.println(shape.getColor());

            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println(circle.getArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println(rectangle.getArea());
            }
        }
    }
}
