/*
* File: Book.java
* Author: Nagy Bianka
* Copyright: 2026, Nagy Bianka
* Group: Szoft II/N
* Date: 2026-10-22
* Github: https://github.com/Bianka-9/
* Licenc: MIT
*/
package com.example;

public class Book {
    int id;
    String title;
    String author;
    int year;
    int pages;

    public Book() {
    }


    
    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + ", pages=" + pages
                + "]";
    }



    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public Book(int id, String title, String author, int year, int pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
}
