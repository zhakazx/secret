/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import com.mysql.jdbc.Driver;
import java.sql.*;

public class Koneksi {
    public static Connection con;
    
    public static Connection getConnection() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost/uh_202079";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println("Koneksi gagal "+ e.getMessage());
        }
        return con;
    }
}
