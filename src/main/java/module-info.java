module com.example.mz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mz to javafx.fxml;
    exports com.example.mz;
}