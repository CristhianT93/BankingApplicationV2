package my.bankingapplication;

import java.sql.*;
import java.sql.DriverManager;
public class MyConnection {
    //Function to connect to mssql database
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        String db_username = "TeamRocket";
        String db_password = "Giovanni3";
        
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://oop-java.database.windows.net:1433;databaseName=Banking Database", db_username, db_password);
            
            st = con.createStatement();
            
            rs = st.executeQuery("select * from Employee");
            
            while (rs.next()) {
                System.out.println(rs.getString("username") + " " + rs.getString("password"));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
}
