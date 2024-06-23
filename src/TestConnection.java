import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://HAMAJIS-PIXEL:1433;databaseName=CodeAssessManagement;encrypt=true;trustServerCertificate=true";
        String user = "classroom";
        String password = "123456";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            if (con != null) {
                System.out.println("Connected to SQL Server!");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}

