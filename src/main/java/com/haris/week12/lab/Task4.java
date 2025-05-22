package com.haris.week12.lab;

public class Task4 {
    //You are tasked with creating a file reader utility that safely handles missing files and null inputs.
    //Tasks:
    //Create a class SafeFileReader with:
    //public void printFirstLine(String filePath)
    //Uses BufferedReader to print the first line from the file.
    //Use a try-catch block to handle FileNotFoundException and IOException.
    //Print a friendly error message for each exception.
    //public void printLength(String input)
    //Print the length of the input string.
    //Handle NullPointerException gracefully.
    //In main():
    //Call both methods with valid and invalid inputs to test exception handling.
    public static void main(String[] args) {
        SafeFileReader safeFileReader = new SafeFileReader();

        safeFileReader.printFirstLine(null);
        safeFileReader.printLength(null);
    }
}
