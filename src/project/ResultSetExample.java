package project;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetExample {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = ConnectionProvider.getCon();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Student_info");

            // Process the ResultSet
            while (rs.next()) {
                int id = rs.getInt("Sid");
                String name = rs.getString("Fullname");

                // Print or process data as needed
                System.out.println("ID: " + id + ", Name: " + name );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources in reverse order of creation
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
