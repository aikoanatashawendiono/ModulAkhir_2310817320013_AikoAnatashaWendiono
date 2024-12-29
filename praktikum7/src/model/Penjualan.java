package model;

import java.util.Date;

public class Penjualan {
    private int penjualanId;
    private int pelangganId;
    private int bukuId;
    private int jumlah;
    private double totalHarga;
    private Date tanggal;


    public Penjualan(int penjualanId, int pelangganId, int bukuId, int jumlah, double totalHarga, Date tanggal) {
        this.penjualanId = penjualanId;
        this.pelangganId = pelangganId;
        this.bukuId = bukuId;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
        this.tanggal = tanggal;
    }

    // Getter and Setter 
    public int getPenjualanId() {
        return penjualanId;
    }

    public void setPenjualanId(int penjualanId) {
        this.penjualanId = penjualanId;
    }

    public int getPelangganId() {
        return pelangganId;
    }

    public void setPelangganId(int pelangganId) {
        this.pelangganId = pelangganId;
    }

    public int getBukuId() {
        return bukuId;
    }

    public void setBukuId(int bukuId) {
        this.bukuId = bukuId;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
}
