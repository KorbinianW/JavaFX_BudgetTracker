module com.bini.bankingappjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.fasterxml.jackson.databind;

    opens com.bini.bankingappjavafx to javafx.fxml;
    exports com.bini.bankingappjavafx;
}