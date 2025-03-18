package com.haris.week3.lab;

import java.sql.*;

public class Db {

    public static final String URL = "jdbc:mysql://oop.ibu.edu.ba:3306/mtest_db?allowPublicKeyRetrieval=true&useSSL=false";
    public static final String USERNAME = "mtestdb_usr";
    public static final String PASSWORD = "mtest97dbUSR";

    private static Connection connection = null;

    public Db() throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        System.out.println("Connected to database successfully!");
    }

    public void getScheduleByDay(String dayOfWeek) throws SQLException {
        String query = "SELECT id, course_id " +
                "FROM schedule " +
                "WHERE day_of_week = ?";

        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, dayOfWeek);

        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println("Id: " + rs.getInt("id") + ", Course Id: " + rs.getInt("course_id"));
        }
    }
}
