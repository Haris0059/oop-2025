package com.haris.week15.examPrep1.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Library<T extends Publication> {
    private List<T> items;

    public List<T> filterByTitle(String title) {
        List<T> result = new ArrayList<>();

        for (T item : items) {
            if (item.getTitle().equals(title)) {
                result.add(item);
            }
        }

        return  result;
    }

    public T getByIsbn(int isbn) {
        for (T item : items) {
            if (item.getIsbn() == isbn) {
                return item;
            }
        }
        throw new NoSuchElementException("No publication found with ISBN: " + isbn);
    }
}
