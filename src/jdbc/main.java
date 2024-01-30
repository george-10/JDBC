package jdbc;
import java.sql.*;

public class main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://avnadmin:AVNS_5pZhuYE1OWJOMzdy61m@mysql-3775690f-george-cf4d.a.aivencloud.com:13427/defaultdb?ssl-mode=REQUIRED";
        String username = "avnadmin";
        String password = "AVNS_5pZhuYE1OWJOMzdy61m";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement statement = connection.createStatement();
            String insertSQL = "INSERT INTO students (name, code, address, age) " +
                    "VALUES ('Jad', '51623', 'Tripoli', 52)";
            statement.executeUpdate(insertSQL);

            ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String code = resultSet.getString("code");
                String address = resultSet.getString("address");
                int age = resultSet.getInt("age");

                System.out.println("Name: " + name + ", Code: " + code + ", Address: " + address + ", Age: " + age);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
