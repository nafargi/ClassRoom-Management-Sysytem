
package project;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon()
    {
        try
         {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection con=DriverManager.getConnection("jdbc:sqlserver://HAMAJIS-PIXEL:1433;databaseName=CodeAssessManagement;encrypt=true;trustServerCertificate=true","classroom","123456");
             return con;
         }

         catch(Exception e)
         {
             return null;
         }
    }
}
