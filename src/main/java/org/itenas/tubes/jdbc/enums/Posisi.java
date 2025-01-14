package org.itenas.tubes.jdbc.enums;

/**
 *
 * @author MyBook Z Series
 */
public enum Posisi {
    OWNER("Owner"),
    ADMIN("Admin"),
    KASIR("Kasir");
    
    private final String posisi;

    private Posisi(String posisi) {
        this.posisi = posisi;
    }

    public String getPosisi() {
        return posisi;
    }
    
    
}
