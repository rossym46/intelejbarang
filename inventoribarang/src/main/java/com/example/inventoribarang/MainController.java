package com.example.inventoribarang; // Ganti dengan nama package Anda

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField txtId; // Input untuk ID Barang

    @FXML
    private TextField txtNama; // Input untuk Nama Barang

    @FXML
    private TextField txtSatuan; // Input untuk Satuan

    @FXML
    private TextField txtHarga; // Input untuk Harga

    @FXML
    private Button btnSimpan; // Tombol Simpan

    @FXML
    private Button btnEdit; // Tombol Edit

    @FXML
    private Button btnHapus; // Tombol Hapus

    @FXML
    private TableView<?> tableView; // Tabel untuk menampilkan data barang

    @FXML
    private TableColumn<?, ?> colId; // Kolom ID Barang

    @FXML
    private TableColumn<?, ?> colNama; // Kolom Nama Barang

    @FXML
    private TableColumn<?, ?> colSatuan; // Kolom Satuan

    @FXML
    private TableColumn<?, ?> colHarga; // Kolom Harga

    // Event handler untuk tombol Simpan
    @FXML
    void simpanData(ActionEvent event) {
        // Tambahkan logika untuk menyimpan data
        System.out.println("Data disimpan!");
    }

    // Event handler untuk tombol Edit
    @FXML
    void editData(ActionEvent event) {
        // Tambahkan logika untuk mengedit data
        System.out.println("Data diedit!");
    }

    // Event handler untuk tombol Hapus
    @FXML
    void hapusData(ActionEvent event) {
        // Tambahkan logika untuk menghapus data
        System.out.println("Data dihapus!");
    }
}
