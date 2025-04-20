package com.haris.week7.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Playable  {
    void play();
}

class Guitar implements Playable {
    private String brand;

    public Guitar(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void play() {
        System.out.println("Guitar sounds!");
    }
}

class Piano implements Playable {
    private String brand;

    public Piano(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void play() {
        System.out.println("Piano Sounds!");
    }
}

class Drum implements Playable {
    private String brand;

    public Drum(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void play() {
        System.out.println("Drum Sounds!");
    }
}

class Task2 {

    public static void main(String[] args) {
        ArrayList<Playable> playables = new ArrayList<>();

        Guitar guitar = new Guitar("Some brand");
        Piano piano = new Piano("Mozzart");
        Drum drum = new Drum("Drum brand");

        Collections.addAll(playables,guitar,piano,drum);

        for (Playable playable : playables) {

            if (playable != null) {
                playable.play();

                if (playable instanceof Guitar) {
                    Guitar guitar1 = (Guitar) playable;
                    System.out.println(guitar1.getBrand());
                } else if (playable instanceof Piano) {
                    Piano piano1 = (Piano) playable;
                    System.out.println(piano1.getBrand());
                } else {
                    Drum drum1 = (Drum) playable;
                    System.out.println(drum1.getBrand());
                }
            }

        }
    }
}
