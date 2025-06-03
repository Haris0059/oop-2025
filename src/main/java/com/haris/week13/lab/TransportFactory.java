package com.haris.week13.lab;

public class TransportFactory {

    public Transport createTransport(String type) {
        if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        } else if (type.equalsIgnoreCase("ship")) {
            return new Ship();
        }

        return null;
    }
}
