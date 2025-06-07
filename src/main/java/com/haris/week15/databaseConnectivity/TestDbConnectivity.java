package com.haris.week15.databaseConnectivity;

import java.sql.SQLException;

public class TestDbConnectivity {
    public static void main(String[] args) {
        try {
            DbConnect db = new DbConnect();

            db.getUsers("Becir", 2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
