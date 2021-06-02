package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Connect {
    static String dburl = "jdbc:sqlite:src/Database/database.db";
    static Connection conn;

    private static void connect() throws SQLException {
        try {
            if (conn == null){
                conn = DriverManager.getConnection(dburl);
                System.out.println("Connection to SQLite has been established.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
    public static void SayHi() throws SQLException {
        connect();
        System.out.println("Hi");
    }
}