// TableController.java
package com.example.inventoribarang;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableController {

    @FXML
    private TableView<Item> tableView;

    @FXML
    private TableColumn<Item, Integer> colId;

    @FXML
    private TableColumn<Item, String> colNama;

    @FXML
    private TableColumn<Item, String> colSatuan;

    @FXML
    private TableColumn<Item, Double> colHarga;

    private ObservableList<Item> itemList;

    @FXML
    public void initialize() {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        colSatuan.setCellValueFactory(new PropertyValueFactory<>("satuan"));
        colHarga.setCellValueFactory(new PropertyValueFactory<>("harga"));

        itemList = FXCollections.observableArrayList(
                new Item(1, "Buku", "Pcs", 12000.0),
                new Item(2, "Pulpen", "Box", 45000.0),
                new Item(3, "Penghapus", "Pcs", 5000.0)
        );

        tableView.setItems(itemList);
    }
}
