import java.sql.*;

public class JdbcMySQLStudent {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Step 1: Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");  // For MySQL 8+
            // For older MySQL: "com.mysql.jdbc.Driver"

            // Step 2: Connect to MySQL
            String url = "jdbc:mysql://localhost:3306/StudentDB"; // database name
            String user = "root";      // your MySQL username
            String password = "root";  // your MySQL password
            conn = DriverManager.getConnection(url, user, password);

            // Step 3: Create statement
            stmt = conn.createStatement();

            // --- INSERT ---
            System.out.println("Inserting record...");
            String sqlInsert = "INSERT INTO Student (RollNo, Name, Marks) VALUES (101, 'Rohan', 85)";
            stmt.executeUpdate(sqlInsert);

            // --- UPDATE ---
            System.out.println("Updating record...");
            String sqlUpdate = "UPDATE Student SET Marks = 90 WHERE Name = 'Rohan'";
            stmt.executeUpdate(sqlUpdate);

            // --- SELECT ---
            System.out.println("Selecting records...");
            String sqlSelect = "SELECT * FROM Student";
            ResultSet rs = stmt.executeQuery(sqlSelect);

            while (rs.next()) {
                int rollNo = rs.getInt("RollNo");
                String name = rs.getString("Name");
                int marks = rs.getInt("Marks");
                System.out.println("RollNo: " + rollNo + ", Name: " + name + ", Marks: " + marks);
            }
            rs.close();

            // --- DELETE ---
            System.out.println("Deleting record...");
            String sqlDelete = "DELETE FROM Student WHERE Name = 'Rohan'";
            stmt.executeUpdate(sqlDelete);

            System.out.println("All operations completed successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
