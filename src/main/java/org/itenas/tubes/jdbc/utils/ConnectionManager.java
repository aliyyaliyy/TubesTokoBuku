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
    private String url = "jdbc:mysql://localhost:3306/tokobuku";
    private String Driver = "com.mysql.cj.jdbc.Driver";
    private String Username = "root";
    private String Password = "basdat2024";
    
    public Connection logOn () {
        if (con == null) {
            try {
                Class.forName(Driver).newInstance();
                con = java.sql.DriverManager.getConnection(url, Username, Password);
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

    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        cm.logOn();
        cm.logOff();
    }
}
