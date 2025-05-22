package com.haris.week8.lab;

class Product<T extends Comparable<T>> {
    private String name;
    private T price; // generic type for price (e.g., Integer, Double, etc.)

    public Product(String name, T price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    public String comparePrice(Product<T> other) {
        int comparison = getPrice().compareTo(other.getPrice());

        if (comparison == 0) {
            return "same price";
        } else if (comparison < 0) {
            return "cheaper then " + other.getName();
        } else {
            return "expensive more then " + other.getName();
        }
    }
}

class Task2 {

    public static void main(String[] args) {
        Product<Double> p1 = new Product<>("Laptop", 1200.00);
        Product<Double> p2 = new Product<>("Tablet", 850.00);
        System.out.println(p1.comparePrice(p2));

    }
    //String comparePrice(Product<T> other)
    //This method should:
    //Return:
    //"Product [this.name] is more expensive than [other.name]"
    //"Product [this.name] is cheaper than [other.name]"
    //"Product [this.name] and [other.name] have the same price"
    //In the main Method
    //Create two products:
    //Product<Double> p1 = new Product<>("Laptop", 1200.00);
    //Product<Double> p2 = new Product<>("Tablet", 850.00);
    //Call comparePrice(p2) on p1 and print the result.
}
