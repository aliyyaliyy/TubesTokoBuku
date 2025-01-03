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
import org.itenas.tubes.jdbc.model.DataPegawai;
import org.itenas.tubes.jdbc.crud.Crud;
import org.itenas.tubes.jdbc.utils.ConnectionManager;
import org.itenas.tubes.jdbc.enums.Posisi;


public class ControllerDataPegawai implements Crud<DataPegawai>{
    
    ConnectionManager connMan = new ConnectionManager();
    Connection connection = connMan.logOn();

    @Override
    public boolean create(DataPegawai pegawai) {
                String query = "INSERT INTO dataPegawai(namaPegawai, email, posisi, password)"
                + " VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, pegawai.getNamaPegawai());
            statement.setString(2, pegawai.getEmail());
            statement.setString(3, pegawai.getPosisi());
            statement.setString(4, pegawai.getPassword());
            
            return statement.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Error saat menambahkan data: " + ex.getMessage());
            return false;
        }
    }

    public boolean update(DataPegawai pegawai) {
    String query = "UPDATE dataPegawai SET posisi = ? WHERE idPegawai = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, pegawai.getPosisi());
            statement.setInt(2, pegawai.getIdPegawai());
            
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

    @Override
    public List<DataPegawai> showAll() {
        List<DataPegawai> listPegawai = new ArrayList<>();
        String query = "SELECT * FROM dataPegawai";
        
        try (Statement statement = connection.createStatement();
                ResultSet resulSet = statement.executeQuery(query)) {
            
            //ini melakukan iterasi hasil resulset
            while (resulSet.next()) {
                DataPegawai pegawai = new DataPegawai();
                pegawai.setIdPegawai(resulSet.getInt("idPegawai"));
                pegawai.setNamaPegawai(resulSet.getString("namaPegawai"));
                pegawai.setEmail(resulSet.getString("email"));
                pegawai.setPosisi(resulSet.getString("posisi"));
                pegawai.setPassword(resulSet.getString("password"));
                
                //menambahkan objek ke list
                listPegawai.add(pegawai);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return listPegawai;
    }

    @Override
    public boolean delete(int idPegawai) {
        String query = "DELETE FROM dataPegawai WHERE idPegawai = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idPegawai);
            
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            System.out.println("Error saat menghapus data pegawai: " + ex.getMessage());
              return false;
        }
    }

    //method tambahan buat login
    public DataPegawai login(String posisi, String password) {
        String query = "SELECT * FROM dataPegawai WHERE posisi = ? AND password = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, posisi);
            statement.setString(2, password);
            
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                //apabila data berhasil ditemukan. membuat objek ke data pegawai
                DataPegawai pegawai = new DataPegawai();
                pegawai.setIdPegawai(resultSet.getInt("idPegawai"));
                pegawai.setNamaPegawai(resultSet.getString("namaPegawai"));
                pegawai.setEmail(resultSet.getString("email"));
                pegawai.setPosisi(resultSet.getString("posisi"));
                pegawai.setPassword(resultSet.getString("password"));
                
                return pegawai;
            }
        } catch (SQLException ex) {
            System.out.println("Error saat login: " + ex.getMessage());
        }
        return null;
    }

    //Bikin method buat nyari berdasarkan, idPegawai, namaPegawai, jabatan
    public List<DataPegawai> findByIdNamePosisi(String keyword) {
        List<DataPegawai> listPegawai = new ArrayList<>();
        String query = "SELECT * FROM dataPegawai WHERE idPegawai LIKE ? OR namaPegawai LIKE ? OR posisi LIKE ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "%" + keyword + "%");
            statement.setString(2, "%" + keyword + "%");
            statement.setString(3, "%" + keyword + "%");
            
            ResultSet resulSet = statement.executeQuery();
            while (resulSet.next()) {
                DataPegawai pegawai = new DataPegawai();
                pegawai.setIdPegawai(resulSet.getInt("idPegawai"));
                pegawai.setNamaPegawai(resulSet.getString("namaPegawai"));
                pegawai.setEmail(resulSet.getString("email"));
                pegawai.setPosisi(resulSet.getString("posisi"));
                pegawai.setPassword(resulSet.getString("password"));
                listPegawai.add(pegawai);
            }
        } catch (SQLException ex) {
            System.out.println("Error saat mencari data pegawai: " + ex.getMessage());
        }
        return listPegawai;
    }
}
