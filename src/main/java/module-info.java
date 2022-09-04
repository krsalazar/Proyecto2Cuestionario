module com.example.proyecto2cuestionario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyecto2cuestionario to javafx.fxml;
    exports com.example.proyecto2cuestionario;
}