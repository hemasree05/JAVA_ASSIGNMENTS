import java.sql.*;

class Exp18 {
    public static void main(String[] args) {
        try {
            throw new SQLException("Database connection failed");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
