/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itenas.tubes.jdbc.repository;

/**
 *
 * @author MyBook Z Series
 */

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.itenas.tubes.jdbc.utils.ConnectionManager;
import org.itenas.tubes.jdbc.model.DataPegawai;

public class ControllerLogin {
    
    public boolean validateLogin(String posisi, String password) {
        boolean isUserValid = false;
        String query = "SELECT * FROM dataPegawai WHERE posisi = ? AND password = ?";
        ConnectionManager conMan = new ConnectionManager();

        try (Connection conn = conMan.logOn();
             PreparedStatement statement = conn.prepareStatement(query)) {

            statement.setString(1, posisi);
            statement.setString(2, password);

            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    isUserValid = true; // Data valid
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isUserValid;
    }
    
}
