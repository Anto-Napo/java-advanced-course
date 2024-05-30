package com.anto;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        //! Don't forget to add a mySQL dependency : dependencies { implementation "mysql:mysql-connector-java:8.0.29" }
        //! Setup this mySQL database
        //*+------+-----------------+
        //*| id   | name            |
        //*+------+-----------------+
        //*|    1 | Monitor Samsung |
        //*|    2 | Razor mouse     |
        //*|    3 | Asus computer   |
        //*|    4 | Keyboard        |
        //*+------+-----------------+

        String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC"; //? 3306 by default | localhost:port/database?serverTimezone=UTC
        String userName = "root";
        String password = ""; //! Set your password

        try {
            Connection con = DriverManager.getConnection(url, userName, password); //? Connect

            Statement statement = con.createStatement();

            statement.execute("INSERT INTO products values (4, 'HP printer')");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM products");

            while(resultSet.next()) {
                System.out.print("id: " + resultSet.getInt("id"));
                System.out.print(" | ");
                System.out.print("name: " + resultSet.getString("name") + '\n');
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}