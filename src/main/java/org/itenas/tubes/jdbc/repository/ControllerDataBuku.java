/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itenas.tubes.jdbc.repository;

/**
 *
 * @author MyBook Z Series
 */

import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.itenas.tubes.jdbc.model.DataBuku;
import org.itenas.tubes.jdbc.crud.Crud;
import org.itenas.tubes.jdbc.utils.ConnectionManager;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.itenas.tubes.jdbc.view.Transaksi;

public class ControllerDataBuku implements Crud<DataBuku>{
    
    ConnectionManager connMan = new ConnectionManager();
    Connection connection = connMan.logOn();

    @Override
    public boolean create(DataBuku buku) {
        String query = "INSERT INTO databuku(noISBN, judulBuku, genre, pengarang, tahunTerbit, harga, stok, tanggalMasuk)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try  (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, buku.getIsbn());
            statement.setString(2, buku.getJudulBuku());
            statement.setString(3, buku.getGenre());
            statement.setString(4, buku.getPengarang());
            statement.setInt(5, buku.getTahunTerbit());
            statement.setInt(6, buku.getHarga());
            statement.setInt(7, buku.getStok());
            statement.setDate(8, buku.getTanggalMasuk());
            
            return statement.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Error saat menambahkan data: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public List<DataBuku> showAll() {
        List<DataBuku> listBuku = new ArrayList<>();
        String query = "SELECT * FROM dataBuku";
        
        try (Statement statement = connection.createStatement();
                ResultSet resulset = statement.executeQuery(query)) {
            
            while (resulset.next()) {
                DataBuku buku = new DataBuku();
                buku.setIsbn(resulset.getString("noISBN"));
                buku.setJudulBuku(resulset.getString("judulBuku"));
                buku.setGenre(resulset.getString("genre"));
                buku.setPengarang(resulset.getString("pengarang"));
                buku.setTahunTerbit(resulset.getInt("tahunTerbit"));
                buku.setHarga(resulset.getInt("harga"));
                buku.setStok(resulset.getInt("stok"));
                buku.setTanggalMasuk(resulset.getDate("tanggalMasuk"));
                
                listBuku.add(buku);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return listBuku;
    }


    public boolean updateHarga(DataBuku buku) {
        String query = "UPDATE databuku SET harga = ? WHERE noISBN = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, buku.getHarga());
            statement.setString(2, buku.getIsbn());
            
            return statement.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Error saat mengupdate harga: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean updateStok(DataBuku buku) {
        String query = "UPDATE dataBuku SET stok = ? WHERE noISBN = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, buku.getStok());
            statement.setString(2, buku.getIsbn());
            
            return statement.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Error saat mengupdate stok: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int idPegawai) { //idPegawai?
        String query = "DELETE FROM dataBuku WHERE noISBN = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idPegawai);
            
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            System.out.println("Error saat menghapus data buku: " + ex.getMessage());
            return false;
        }
    }
    
    public List<DataBuku> findBook(String keyword) {
        List<DataBuku> listBuku = new ArrayList<>();
    
        // Query untuk pencarian berdasarkan berbagai kolom
        String query = "SELECT * FROM dataBuku WHERE noISBN LIKE ? OR judulBuku LIKE ? OR genre LIKE ? OR pengarang LIKE ? OR tahunTerbit LIKE ? OR harga LIKE ? OR stok LIKE ? OR tanggalMasuk LIKE ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            // Pertama, cek apakah keyword adalah angka
            if (isNumeric(keyword)) {
                int numKeyword = Integer.parseInt(keyword);
                // Jika keyword adalah angka, kita set pencarian berdasarkan angka
                statement.setInt(1, numKeyword);  // noISBN (angka)
                statement.setString(2, "%" + keyword + "%");  // judulBuku (teks)
                statement.setString(3, "%" + keyword + "%");  // genre (teks)
                statement.setString(4, "%" + keyword + "%");  // pengarang (teks)
                statement.setInt(5, numKeyword);  // tahunTerbit (angka)
                statement.setInt(6, numKeyword);  // harga (angka)
                statement.setInt(7, numKeyword);  // stok (angka)
                statement.setString(8, "%" + keyword + "%");  // tanggalMasuk (teks)
            } else {
                // Jika keyword bukan angka, kita set pencarian berdasarkan string
                statement.setString(1, "%" + keyword + "%");  // noISBN (meskipun numerik, kita tetap gunakan LIKE dengan string)
                statement.setString(2, "%" + keyword + "%");  // judulBuku (teks)
                statement.setString(3, "%" + keyword + "%");  // genre (teks)
                statement.setString(4, "%" + keyword + "%");  // pengarang (teks)
                statement.setString(5, "%" + keyword + "%");  // tahunTerbit (teks)
                statement.setString(6, "%" + keyword + "%");  // harga (teks)
                statement.setString(7, "%" + keyword + "%");  // stok (teks)
                statement.setString(8, "%" + keyword + "%");  // tanggalMasuk (teks)
            }

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                DataBuku buku = new DataBuku();
                buku.setIsbn(resultSet.getString("noISBN"));
                buku.setJudulBuku(resultSet.getString("judulBuku"));
                buku.setGenre(resultSet.getString("genre"));
                buku.setPengarang(resultSet.getString("pengarang"));
                buku.setTahunTerbit(resultSet.getInt("tahunTerbit"));
                buku.setHarga(resultSet.getInt("harga"));
                buku.setStok(resultSet.getInt("stok"));
                buku.setTanggalMasuk(resultSet.getDate("tanggalMasuk"));
                listBuku.add(buku);
            }
        } catch (SQLException ex) {
            System.out.println("Error saat mencari data: " + ex.getMessage());
        }
        return listBuku;
    }

    // Method untuk memeriksa apakah input adalah angka
    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    //method untuk mengurangi/mengupdate stok buku ketika sudah dibeli 
    public void updateStokBuku(DefaultTableModel model) {
        try (Connection conn = ConnectionManager.getConnection()) {
            String queryUpdateStok = "UPDATE dataBuku SET stok = stok - ? WHERE noISBN = ?";
            PreparedStatement stmUpdateStok = conn.prepareStatement(queryUpdateStok);

            // Menyiapkan query untuk cek stok
            String checkStokQuery = "SELECT stok FROM dataBuku WHERE noISBN = ?";
            PreparedStatement stmCheckStok = conn.prepareStatement(checkStokQuery);

            for (int i = 0; i < model.getRowCount(); i++) {
                double jumlahBeli = Double.parseDouble(model.getValueAt(i, 3).toString());
                String noISBN = model.getValueAt(i, 0).toString();
                
                // Debugging: Tampilkan nilai noISBN
                System.out.println("Checking stok for noISBN: " + noISBN);

                // Mengecek stok
                stmCheckStok.setString(1, noISBN);
                ResultSet rs = stmCheckStok.executeQuery();

                if (rs.next()) {
                    int stok = rs.getInt("stok");
                    if (stok < jumlahBeli) {
                        JOptionPane.showMessageDialog(null, 
                            "Stok untuk buku dengan ISBN " + noISBN + " tidak mencukupi!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                        continue; // Lewati buku ini
                    }
                } else {
                    JOptionPane.showMessageDialog(null, 
                        "Buku dengan ISBN " + noISBN + " tidak ditemukan di database!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                    continue; // Lewati jika noISBN tidak ditemukan
                }
                
                // mengupdate stok
                stmUpdateStok.setInt(1, (int) jumlahBeli); // Konversi ke integer jika SQL butuh tipe int
                stmUpdateStok.setString(2, noISBN);
                stmUpdateStok.executeUpdate();

                int stokBaru = rs.getInt("stok") - (int) jumlahBeli;
                model.setValueAt(stokBaru, i, 4); // Asumsikan kolom stok ada di index 4
            }
            
            conn.commit();
            JOptionPane.showMessageDialog(null, "Stok buku berhasil diperbarui!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memperbarui stok buku\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
