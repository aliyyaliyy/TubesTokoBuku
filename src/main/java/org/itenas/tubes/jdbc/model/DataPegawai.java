
package org.itenas.tubes.jdbc.model;

import java.security.SecureRandom;
/**
 *
 * @author MyBook Z Series
 */
public class DataPegawai {
    private int idPegawai;
    private String namaPegawai;
    private String email;
    private String posisi;
    private String password;

    public DataPegawai() {
    }

    public DataPegawai(int idPegawai, String namaPegawai, String email, String posisi, String password) {
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.email = email;
        this.posisi = posisi;
        this.password = password;
    }

    public String generatePassword() {      //dibuat public agar bisa dipake di class lain
        int length = 8; 
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < length; i++) {
            password.append(chars.charAt(random.nextInt(chars.length())));
        } 
        return password.toString();
    }

    public int getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
