package com.haris.week12.lab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class SafeFileReader {
    public void printFirstLine(String filePath) {
        if (filePath == null) {
            System.out.println("Exception: File path can't be null!");
        } else {
            try (BufferedReader reader = new BufferedReader(
                    new FileReader(filePath)
            )) {
                List<String> lines = reader.lines().collect(Collectors.toList());

                System.out.println(lines.get(0));
            } catch (IOException e) {
                System.out.println("Exception: ".concat(e.getMessage()));
            }
        }
    }

    public void printLength(String input) {
        if (input == null) {
            System.out.println("Exception: Input can't be a null!");
        } else {
            System.out.println(input.length());
        }
    }
}
