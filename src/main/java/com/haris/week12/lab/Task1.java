package com.haris.week12.lab;

public class Task1 {
    public static void main(String[] args) {
        String[] notes = {"Haris", "Edin", "Hello everyone!"};
        NoteManager noteManager = new NoteManager("notes.txt");

        noteManager.clearAllNotes();
        noteManager.saveNote("Hello World!");
        noteManager.saveAllNotes(notes);
        noteManager.printAllNotes();

    }
}
