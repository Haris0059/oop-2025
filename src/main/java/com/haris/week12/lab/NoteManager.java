package com.haris.week12.lab;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class NoteManager {
    private final String FILE_NAME;
    private final boolean APPEND_TO_FILE = true;

    public NoteManager(String FILE_NAME) {
        this.FILE_NAME = FILE_NAME;
    }

    public String getFILE_NAME() {
        return FILE_NAME;
    }

    public void saveNote(String note) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, APPEND_TO_FILE))) {
            writer.write(note.concat("\n"));
        } catch (IOException e) {
            System.out.println("Caught exception: ".concat(e.getMessage()));
        }
    }

    public void saveAllNotes(String[] notes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, APPEND_TO_FILE))) {
            for (String note : notes) {
                writer.write(note.concat("\n"));
            }
        } catch (IOException e) {
            System.out.println("Caught exception: ".concat(e.getMessage()));
        }
    }

    public void printAllNotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            List<String> lines = reader.lines().collect(Collectors.toList());

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Caught exception: ".concat(e.getMessage()));
        }
    }

    public void clearAllNotes() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.close();
        } catch (IOException e) {
            System.out.println("Caught exception: ".concat(e.getMessage()));
        }
    }
}
