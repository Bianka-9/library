/*
* File: Main.java
* Author: Nagy Bianka
* Copyright: 2026, Nagy Bianka
* Group: Szoft II/N
* Date: 2026-10-21
* Github: https://github.com/Bianka-9/
* Licenc: MIT
*/
package com.example;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService(new Sqlite());
        BookView bookView = new BookView();
        new BookController(bookService, bookView);
    }
}