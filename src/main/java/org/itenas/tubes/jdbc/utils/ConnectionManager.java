package org.itenas.tubes.jdbc.utils;

/**
 *
 * @author MyBook Z Series
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private Connection con;
    private static String url = "jdbc:mysql://localhost:3306/tokobuku";
    private static String Driver = "com.mysql.cj.jdbc.Driver";
    private static String Username = "root";
    private static String Password = "basdat2024";
    
    public Connection logOn () {
        if (con == null) {
            try {
                Class.forName(Driver).newInstance();
                con = DriverManager.getConnection(url, Username, Password);
                System.out.println("Koneksi Berhasil!");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return con;
    }
    
    public void logOff() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Koneksi Ditutup!");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static Connection getConnection() throws SQLException {
        try {
            // Mencoba menghubungkan ke database MySQL dengan menggunakan DriverManager
            // Pastikan JDBC driver MySQL sudah ada di classpath
            return DriverManager.getConnection(url, Username, Password);
        } catch (SQLException e) {
            // Jika terjadi kesalahan saat mencoba menghubungkan, lemparkan exception dengan pesan yang lebih jelas
            // Pesan ini akan membantu dalam debugging jika koneksi gagal
            throw new SQLException("Koneksi ke database gagal. Pastikan URL, username, dan password benar, dan database dapat diakses.", e);
        }
    }

    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        cm.logOn();
        cm.logOff();
    }
}
