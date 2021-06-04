package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
                        + " username text NOT NULL)";
                Statement stmt = conn.createStatement();
                stmt.execute(sql);

                String sql2 = "CREATE TABLE IF NOT EXISTS Favorites "
                        + " (id integer USER ID, "
                        + " craftFav text NOT NULL,"
                        + " sprayFav text NOT NULL)";
                stmt.execute(sql2);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
    public static void createNewTable() throws SQLException {
        connect();


    }
    public static void createNewUser(int userID, String username) throws SQLException {
        connect();
        var stmt = conn.createStatement();
        String sql = "INSERT INTO Users (id, username) " + "VALUES (" +userID+ ",'" +username+ "')";
        stmt.executeUpdate(sql);
    }

    public static String getUserName(int id) throws SQLException {
        connect();
        var stmt = conn.createStatement();
        String sql = ("SELECT * from Users WHERE (id= " +id+ ")");
        var results = stmt.executeQuery(sql);
        if (results.next()){
            return results.getString("username");
        } else {
            System.out.println("No user found!");
            return null;
        }

    }


}