module com.danielamar.laliebreylatortuga {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.danielamar.laliebreylatortuga to javafx.fxml;
    exports com.danielamar.laliebreylatortuga;
}
