import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//JDK 7 or below required for JdbcOdbcDriver
public class JdbcOdbc {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // Step 1: Load the driver
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            // Step 2: Establish connection (DSN "myDsn" must be set up in Windows)
            String dsn = "myDsn";
            String url = "jdbc:odbc:" + dsn;
            conn = DriverManager.getConnection(url);

            // Step 3: Create statement
            stmt = conn.createStatement();

            // INSERT
            System.out.println("Inserting record...");
            String sqlInsert = "INSERT INTO Student (RollNo, Name, Marks) VALUES (101, 'Rohan', 85)";
            stmt.executeUpdate(sqlInsert);

            // UPDATE
            System.out.println("Updating record...");
            String sqlUpdate = "UPDATE Student SET Marks = 90 WHERE Name = 'Rohan'";
            stmt.executeUpdate(sqlUpdate);

            // SELECT
            System.out.println("Selecting records...");
            String sqlSelect = "SELECT * FROM Student";
            ResultSet rs = stmt.executeQuery(sqlSelect);
            while (rs.next()) {
                System.out.println("RollNo: " + rs.getInt("RollNo") + ", Name: " + rs.getString("Name"));
            }
            rs.close();

            // DELETE
            System.out.println("Deleting record...");
            String sqlDelete = "DELETE FROM Student WHERE Name = 'Rohan'";
            stmt.executeUpdate(sqlDelete);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 4: Close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}