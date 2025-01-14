package org.itenas.tubes.jdbc.model;

/**
 *
 * @author MyBook Z Series
 */
public class DetailTransaksi {
    private int idDetail;
    private int idTransaksi;
    private int noISBN;
    private int jumlah;
    private double hargaSatuan;
    private double subTotal;

    public DetailTransaksi() {
    }

    public DetailTransaksi(int idDetail, int idTransaksi, int noISBN, int jumlah, double hargaSatuan, double subTotal) {
        this.idDetail = idDetail;
        this.idTransaksi = idTransaksi;
        this.noISBN = noISBN;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
        this.subTotal = subTotal;
    }

    public int getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getNoISBN() {
        return noISBN;
    }

    public void setNoISBN(int noISBN) {
        this.noISBN = noISBN;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(double hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
}
