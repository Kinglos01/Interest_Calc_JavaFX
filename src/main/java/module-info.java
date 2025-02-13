module org.example.interest_calc_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.interest_calc_javafx to javafx.fxml;
    exports org.example.interest_calc_javafx;
}