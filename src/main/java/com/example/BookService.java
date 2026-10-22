/*
* File: BookService.java
* Author: Nagy Bianka
* Copyright: 2026, Nagy Bianka
* Group: Szoft II/N
* Date: 2026-10-22
* Github: https://github.com/Bianka-9/
* Licenc: MIT
*/
package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookService {

    Database database;

    public BookService(Database database){
        this.database = database;
    }


    public List<Book> findAllBooks(){
        try {
            return tryFindAllBooks();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<Book> tryFindAllBooks() throws SQLException{
        List<Book> booksList = new ArrayList<>();
        String sql = "SELECT * FROM books";

        try (
        Connection conn = this.database.connection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql)) {

            while(rs.next()){
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setYear(rs.getInt("year"));
                book.setPages(rs.getInt("pages"));
                booksList.add(book);
                }

        }catch (SQLException e) {
            e.printStackTrace();
        } 

        return booksList;
    }
}
