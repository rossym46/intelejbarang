module com.example.inventoribarang {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.inventoribarang to javafx.fxml;
    exports com.example.inventoribarang;
}
