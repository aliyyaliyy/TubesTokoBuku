package org.itenas.tubes.jdbc.model;

import java.sql.Date;

/**
 *
 * @author MyBook Z Series
 */
public class DataBuku {
    private int isbn;
    private String judulBuku;
    private String genre;
    private String pengarang;
    private int tahunTerbit;
    private int harga;
    private int stok;
    private java.sql.Date tanggalMasuk;

    public DataBuku() {
    }

    public DataBuku(int isbn, String judulBuku, String genre, String pengarang, int tahunTerbit, int harga, int stok, Date tanggalMasuk) {
        this.isbn = isbn;
        this.judulBuku = judulBuku;
        this.genre = genre;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.stok = stok;
        this.tanggalMasuk = tanggalMasuk;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

}
