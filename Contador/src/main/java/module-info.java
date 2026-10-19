module com.danielamar.contador {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.danielamar.contador to javafx.fxml;
    exports com.danielamar.contador;
}
