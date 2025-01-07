/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itenas.tubes.jdbc.repository;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.itenas.tubes.jdbc.utils.ConnectionManager;
import org.itenas.tubes.jdbc.model.Transaksi;
import org.itenas.tubes.jdbc.utils.Session;

/**
 *
 * @author MyBook Z Series
 */
public class ControllerTransaksi {
    
    public void simpenTransaksi(DefaultTableModel model, String totalKeseluruhan, int idPegawai) {

        try (Connection conn = ConnectionManager.getConnection()) {
            String queryTransaksi = "INSERT INTO transaksi (tanggalTransaksi, idPegawai, totalHarga) VALUES (?, ?, ?)";
            PreparedStatement stmTransaksi = conn.prepareStatement(queryTransaksi, Statement.RETURN_GENERATED_KEYS);
            stmTransaksi.setDate(1, new java.sql.Date(System.currentTimeMillis())); //untuk mencatat tanggal hari ini 
            stmTransaksi.setInt(2, Session.idPegawai);
            stmTransaksi.setDouble(3, Double.parseDouble(totalKeseluruhan));
            stmTransaksi.executeUpdate();
            
            //memgambil id transaksi baru
            ResultSet generatedkeys = stmTransaksi.getGeneratedKeys();
            int idTransaksi = 0;
            if (generatedkeys.next()) {
                idTransaksi = generatedkeys.getInt(1);
            }
            
            //menyimpan ke detail transaksi
            String queryDetail = "INSERT INTO detailTransaksi (idTransaksi, noISBN, jumlah, hargaSatuan, subTotal) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmDetail = conn.prepareStatement(queryDetail);
            
            for (int i = 0; i < model.getRowCount(); i++) {                              
                String judulBuku = model.getValueAt(i, 1).toString();
                String jumlah = model.getValueAt(i, 2).toString();
                
                String queryISBN = "SELECT noISBN FROM databuku WHERE judulBuku = ?";
                PreparedStatement stmISBN = conn.prepareStatement(queryISBN);
                stmISBN.setString(1, judulBuku);
                ResultSet rsISBN = stmISBN.executeQuery();
                
                if (rsISBN.next()) {
                    String noISBN = rsISBN.getString("noISBN");
                    
                    //menyimpan detail transaksi
                    stmDetail.setInt(1, idTransaksi);
                    stmDetail.setString(2, noISBN);
                    stmDetail.setInt(3, Integer.parseInt(jumlah));
                    stmDetail.setDouble(4, Double.parseDouble(model.getValueAt(i, 2).toString())); // Harga satuan
                    stmDetail.setDouble(5, Double.parseDouble(model.getValueAt(i, 3).toString())); // Subtotal
                    stmDetail.addBatch();
                } else {
                    JOptionPane.showMessageDialog(null, "Buku " + judulBuku + " tidak ditemukan di databuku!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            
            stmDetail.executeBatch();
            
            JOptionPane.showMessageDialog(null, "Transaksi berhasil disimpan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menyimpan transaksi", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
}
