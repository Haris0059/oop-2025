package com.haris.week8.lab;

class Locker<T> {
    private int lockerNumber; // A Unique number for the locker
    private boolean isLocked; // Flag that tracks whether the locker is locked (default should be true)
    private T item; // The stored item of any type

    public Locker(int lockerNumber, T item) {
        this.lockerNumber = lockerNumber;
        this.item = item;
        this.isLocked = true;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }
    public void setLockerNumber(int lockerNumber) {
        this.lockerNumber = lockerNumber;
    }

    public boolean getIsLocked() {
        return isLocked;
    }
    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }

    public void unlock() {
        this.setLocked(false);
    }

    public void lock() {
        this.setLocked(true);
    }

    public void viewItem() {
        if (this.getIsLocked()) {
            System.out.println("Locker " + this.getLockerNumber() + " is locked. Cannot view items.");
        } else {
            System.out.println("Locker " + this.getLockerNumber() + " contains: " + this.getItem());
        }
    }
}

abstract class Electronic {
    private String chipName;

    public Electronic(String chipName) {
        this.chipName = chipName;
    }

    public String getChipName() {
        return chipName;
    }
    public void setChipName(String chipName) {
        this.chipName = chipName;
    }
}

class Laptop extends Electronic {
    private String brandName;

    public Laptop(String chipName, String brandName) {
        super(chipName);
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}

class MobileDevice extends Electronic {
    private String brandName;

    public MobileDevice(String chipName, String brandName) {
        super(chipName);
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Brand Name: " + this.getBrandName() + ", Chip: " + this.getChipName();
    }
}

class Task1 {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Intel i7", "HP");
        MobileDevice mobileDevice = new MobileDevice("A11", "Iphone");

        Locker locker = new Locker<>(59, laptop);
        Locker locker1 = new Locker<>(13, mobileDevice);

        locker1.unlock();

        locker.viewItem();
        locker1.viewItem();
    }
}

