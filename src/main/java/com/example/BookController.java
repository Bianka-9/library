/*
* File: BookController.java
* Author: Nagy Bianka
* Copyright: 2026, Nagy Bianka
* Group: Szoft II/N
* Date: 2026-10-22
* Github: https://github.com/Bianka-9/
* Licenc: MIT
*/
package com.example;

import java.util.List;

public class BookController {
    BookService bookService;
    BookView bookView;


    public BookController(BookService bookService, BookView bookView){
        this.bookService = bookService;
        this.bookView = bookView;
        initLibrary();
    }

    private void initLibrary(){
        List<Book> booksList = bookService.findAllBooks();
        bookView.printAskedDetails(booksList);
        
    }
}
