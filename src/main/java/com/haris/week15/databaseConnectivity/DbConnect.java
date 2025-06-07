package com.haris.week15.databaseConnectivity;

import java.sql.*;

public class DbConnect {
    private final static String HOST = "jdbc:mysql://oop.ibu.edu.ba:3306/oopgroup1";
    private final static String USERNAME = "oopuser";
    private final static String PASSWORD = "ooppassWD";

    private Connection connection = null;

    public DbConnect() throws SQLException {
        try {
            this.connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw  new RuntimeException(e);
        }
    }

    public void getUsers(String name, int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "SELECT * FROM users WHERE id > ? AND name = ?"
        );

        statement.setInt(1, id);
        statement.setString(2,name);

        ResultSet rs = statement.executeQuery();
        printResultSet(rs);
    }


    public static void printResultSet(ResultSet rs) throws SQLException{
        while(rs.next()) {
            System.out.println("id: " + rs.getString("id"));
            System.out.println("name: " + rs.getString("name"));
        }
    }
}
