package com.haris.week15.examPrep2.designPatterns;

public class Test {
    public static void main(String[] args) {
        Book book = new Book.BookBuilder("To Kill a Mockingbird", "Harper Lee")
                .publicationYear(1960)
                .isBestseller(true)
                .build();

        System.out.println(book.getTitle());  // Should print "To Kill a Mockingbird"
        System.out.println(book.getAuthor()); // Should print "Harper Lee"
        System.out.println(book.getPublicationYear()); // Should print 1960
        System.out.println(book.getIsBestseller()); // Should print true

    }
}
