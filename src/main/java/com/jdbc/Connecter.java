package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecter{
    private Connection connection;

    public Connection getConnection(String url, String user, String password) throws SQLException {

        if (connection != null){
            return this.connection;
        }else{
            return connection = DriverManager.getConnection(url, user, password);
        }
    }
}
