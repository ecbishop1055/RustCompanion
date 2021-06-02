package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Connect {
    static String dburl = "jdbc:sqlite:src/Database/database.db";
    static Connection conn;
    static Statement stmt;

    private static void connect() throws SQLException {
        try {
            if (conn == null){
                conn = DriverManager.getConnection(dburl);
                System.out.println("Connection to SQLite has been established.");
                String sql = "CREATE TABLE IF NOT EXISTS Users "
                        + " (id integer USER ID, "
                        + " username text NOT NULL,"
                        + " password text NOT NULL)";
                Statement stmt = conn.createStatement();
                stmt.execute(sql);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
    public static void createNewTable() throws SQLException {
        connect();


    }
    public static void createNewUser(int userID, String username, String password) throws SQLException {
        connect();
        var stmt = conn.createStatement();
        String sql = "INSERT INTO Users (id, username, password) " + "VALUES (" +userID+ ",'" +username+ "', '" + password + "')";
        stmt.executeUpdate(sql);
    }

}