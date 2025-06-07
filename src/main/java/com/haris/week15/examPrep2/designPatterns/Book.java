package com.haris.week15.examPrep2.designPatterns;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isBestseller;

    public Book(BookBuilder builder) {
        this.author = builder.author;
        this.title = builder.title;
        this.publicationYear = builder.publicationYear;
        this.isBestseller = builder.isBestseller;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public boolean getIsBestseller() {
        return isBestseller;
    }

    static class BookBuilder {
        private String title;
        private String author;
        private int publicationYear;
        private boolean isBestseller;

        public BookBuilder(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public BookBuilder publicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
            return this;
        }

        public BookBuilder isBestseller(boolean isBestseller) {
            this.isBestseller = isBestseller;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
