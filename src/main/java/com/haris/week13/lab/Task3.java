package com.haris.week13.lab;

public class Task3 {
    //You are implementing a transport system using the Factory Method pattern.
    //Tasks:
    //Create an interface Transport with method deliver().
    //Implement two classes:
    //Truck that delivers by land.
    //Ship that delivers by sea.
    //Create a TransportFactory class with:
    //A method createTransport(String type) that returns Truck or Ship based on input.
    //In main():
    //Create transport objects using the factory and call deliver().
    public static void main(String[] args) {
        TransportFactory factory = new TransportFactory();

        Truck truck = (Truck) factory.createTransport("truck");
        truck.deliver();
    }
}
