import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "159Atg45@";
        String databaseName = "temp";
        Connection connection = null;
        Statement statement = null;
        try {
            // Load and register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            // Create database if it does not exist
            String createDatabaseQuery = "CREATE DATABASE IF NOT EXISTS " + databaseName;
            statement.executeUpdate(createDatabaseQuery);

            // Switch to the new database
            statement.execute("USE " + databaseName);

            // Create table if it does not exist
            String createTableQuery = "CREATE TABLE IF NOT EXISTS users ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "name VARCHAR(255) NOT NULL)";
            statement.executeUpdate(createTableQuery);

            // Insert a record
            String insertQuery = "INSERT INTO users (name) VALUES ('prashant pal')";
            statement.executeUpdate(insertQuery);

            System.out.println("Database, table, and record created successfully.");
            String query="select * from users";
            ResultSet table=statement.executeQuery(query);
            while(table.next()){
                int id=table.getInt("id");
                String name=table.getString("name");
                System.out.print("ID "+id);
                System.out.println("name "+name);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL exception occurred.");
            e.printStackTrace();
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
        } finally {
            // Close resources
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
