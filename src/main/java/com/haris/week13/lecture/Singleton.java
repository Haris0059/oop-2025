package com.haris.week13.lecture;

class Singleton {
    private static Singleton instance;

    public Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

}

class Test {
    public static void main(String[] args) {
        Singleton first = Singleton.getInstance();
        Singleton second = Singleton.getInstance();

        if (first.equals(second)) {
            System.out.println("Singleton pattern is working!");
        } else {
            System.out.println("Singleton pattern is not working!");
        }

    }
}


