package com.haris.week12.lab;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OddNumberIterator implements Iterator<Integer> {
    private int[] numbers;
    private int currentIndex = 0;

    public OddNumberIterator(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < numbers.length && numbers[currentIndex] % 2 == 0) {
            currentIndex++;
        } return currentIndex < numbers.length;
    }

    @Override
    public Integer next() {
        if (!hasNext())
            throw new NoSuchElementException();
        return numbers[currentIndex++];
    }
}
