package org.example.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private static final String URL = "jdbc:postgresql://aws-1-sa-east-1.pooler.supabase.com:6543/postgres";
    private static final String PASSWORD = "Gilbert0Lim!2605";
    private static final String USER = "postgres.tcnkzmuvynehmvgeqhpf";

    public static Connection access() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}