// Item.java
package com.example.inventoribarang;

public class Item {
    private int id;
    private String nama;
    private String satuan;
    private double harga;

    public Item(int id, String nama, String satuan, double harga) {
        this.id = id;
        this.nama = nama;
        this.satuan = satuan;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}