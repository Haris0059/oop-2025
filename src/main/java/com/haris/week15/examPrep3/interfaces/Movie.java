package com.haris.week15.examPrep3.interfaces;

public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private boolean hasWonAwards;

    public Movie(MovieBuilder builder) {
        this.title = builder.title;
        this.director = builder.director;
        this.releaseYear = builder.releaseYear;
        this.hasWonAwards = builder.hasWonAwards;
    }

    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public boolean getHasWonAwards() {
        return hasWonAwards;
    }

    static class MovieBuilder {
        private String title;
        private String director;
        private int releaseYear;
        private boolean hasWonAwards;

        public MovieBuilder(String title, String director) {
            this.title = title;
            this.director = director;
        }

        public MovieBuilder releaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
            return this;
        }

        public MovieBuilder hasWonAwards(boolean hasWonAwards) {
            this.hasWonAwards = hasWonAwards;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }
    }
}
