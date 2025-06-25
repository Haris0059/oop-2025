package com.haris.week15.examPrep3.generics;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class GenericsRun {
    public static void main(String[] args) {
        List<MediaItem> mediaItemList = new ArrayList<>();
        Collections.addAll(mediaItemList, new MediaItem(1, "Roze Suze"), new MediaItem(2, "Goat Season 3"));


        Library<MediaItem> mediaItemLibrary = new Library<>(mediaItemList);

    }
}
