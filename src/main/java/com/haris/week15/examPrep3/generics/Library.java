package com.haris.week15.examPrep3.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library<T extends MediaItem> {
    private List<T> items;

    public Library(List<T> items) {
        this.items = items;
    }

    public List<T> filterByTitle(String title) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.getTitle().contains(title)) {
                result.add(item);
            }
        }
        return result;
    }

    public Optional<T> getByMediaId(int mediaId) {
        for (T item : items) {
            if (item.getMediaId() == mediaId) {
                return Optional.of(item);
            }
        }

        return Optional.empty();
    }

    public List<T> getItems() {
        return items;
    }
    public void setItems(List<T> items) {
        this.items = items;
    }
}
