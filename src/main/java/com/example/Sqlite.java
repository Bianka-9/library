/*
* File: Sqlite.java
* Author: Nagy Bianka
* Copyright: 2026, Nagy Bianka
* Group: Szoft II/N
* Date: 2026-10-21
* Github: https://github.com/Bianka-9/
* Licenc: MIT
*/
package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sqlite implements Database {
    
    public Connection connection(){
        try {
            return tryConnect();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private Connection tryConnect() throws SQLException{
        String url = "jdbc:sqlite:database.db";
        return DriverManager.getConnection(url);
    }
}
