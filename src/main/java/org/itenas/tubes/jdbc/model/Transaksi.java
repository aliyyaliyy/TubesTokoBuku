package org.itenas.tubes.jdbc.model;

/**
 *
 * @author MyBook Z Series
 */
public class Transaksi {
    private int idTransaksi;
    private int tanggalTransaksi;
    private int idPegawai;
    private double totalHarga;

    public Transaksi() {
    }

    public Transaksi(int idTransaksi, int tanggalTransaksi, int idPegawai, double totalHarga) {
        this.idTransaksi = idTransaksi;
        this.tanggalTransaksi = tanggalTransaksi;
        this.idPegawai = idPegawai;
        this.totalHarga = totalHarga;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(int tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public int getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
    
}
