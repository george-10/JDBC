package jdbc;
import java.sql.*;

public class main {
    public static void main(String[] args) {
        // JDBC URL, username, and password
        String jdbcUrl = "jdbc:mysql://avnadmin:AVNS_5pZhuYE1OWJOMzdy61m@mysql-3775690f-george-cf4d.a.aivencloud.com:13427/defaultdb?ssl-mode=REQUIRED";
        String username = "avnadmin";
        String password = "AVNS_5pZhuYE1OWJOMzdy61m";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement statement = connection.createStatement();
            String createTableSQL = "CREATE TABLE my_table (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(255) NOT NULL" +
                    ")";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully.");

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
