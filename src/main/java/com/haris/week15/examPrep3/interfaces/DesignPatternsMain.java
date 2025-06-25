package com.haris.week15.examPrep3.interfaces;

public class DesignPatternsMain {
    public static void main(String[] args) {
        Movie movie = new Movie.MovieBuilder("Inception", "Christopher Nolan")
                .releaseYear(2010)
                .hasWonAwards(true)
                .build();

        System.out.println(movie.getTitle());        // Should print "Inception"
        System.out.println(movie.getDirector());     // Should print "Christopher Nolan"
        System.out.println(movie.getReleaseYear());  // Should print 2010
        System.out.println(movie.getHasWonAwards()); // Should print true

    }
}
