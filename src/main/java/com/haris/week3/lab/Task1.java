package com.haris.week3.lab;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {

        ArrayList<MovieRating> ratings = new ArrayList<>();

        addRating(ratings, MovieRating.PG);
        addRating(ratings, MovieRating.R);

        showRatings(ratings);
    }

    public static void addRating(ArrayList<MovieRating> ratings, MovieRating rating) {
        ratings.add(rating);
        System.out.println("Successfully added!");
    }

    public static void showRatings(ArrayList<MovieRating> ratings) {
        for (MovieRating rating : ratings) {
            System.out.println(rating);
        }
    }

}
