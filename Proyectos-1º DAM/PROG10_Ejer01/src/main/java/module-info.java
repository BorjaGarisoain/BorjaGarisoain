module com.mycompany.prog10_ejer01 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.prog10_ejer01 to javafx.fxml;
    exports com.mycompany.prog10_ejer01;
}
