package com.haris.week15.designPatterns;

public class Vehicle {
    private String model;
    private int year;
    private boolean isElectric;

    public Vehicle(VehicleBuilder builder) {
        this.model = builder.model;
        this.year = builder.year;
        this.isElectric = builder.isElectric;
    }

    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public boolean getIsElectric() {
        return this.isElectric;
    }

    static class VehicleBuilder {
        private String model;
        private int year;
        private boolean isElectric;

        public VehicleBuilder(String model) {
            this.model = model;
        }

        public VehicleBuilder setYear(int year) {
            this.year = year;
            return this;
        }
        public VehicleBuilder setIsElectric() {
            this.isElectric = true;
            return this;
        }
        public Vehicle build() {
            return new Vehicle(this);
        }

        public String getModel() {
            return model;
        }
        public int getYear() {
            return year;
        }
        public boolean getIsElectric() {
            return isElectric;
        }
    }
}
