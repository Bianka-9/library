/*
* File: BookView.java
* Author: Nagy Bianka
* Copyright: 2026, Nagy Bianka
* Group: Szoft II/N
* Date: 2026-10-22
* Github: https://github.com/Bianka-9/
* Licenc: MIT
*/
package com.example;

import java.util.List;

public class BookView {
    public void printAskedDetails(List<Book> booksList){
        System.out.printf(
        "%-3s %-20s %-20s %-4s\n",
         "Id", " Cím", " Szerző", " Év");
        

        booksList.forEach(book -> {
            
          System.out.printf("%-3d %-20s %-20s %-4d\n",
            book.getId(),
            book.getTitle(),
            book.getAuthor(),
            book.getYear()
        );
   });

    }
}
