package com.haris.week12.lab;

public class Task3 {
    // You are managing a simple integer sequence and want to iterate only over odd numbers.
    //Tasks:
    //Create a class OddNumberIterator that implements Iterator<Integer>.
    //Accept an int[] numbers in the constructor.
    //Skip all even numbers in hasNext() logic.
    //In main():
    //Create an array: int[] data = {1, 2, 3, 4, 5, 6, 7};
    //Use OddNumberIterator to iterate and print only odd numbers.

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        OddNumberIterator iterator = new OddNumberIterator(data);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
