package com.mycompany.prog10_ejer01;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class PrimaryController {

    @FXML
    private Button primaryButton;
    @FXML
    private TextField text1;
    @FXML
    private RadioButton but1;
    @FXML
    private RadioButton but2;
    @FXML
    private RadioButton but3;
    @FXML
    private Label res;
    @FXML
    private ToggleGroup button;

    @FXML
    private void Calcular() throws IOException {
        double resultado = 0;
        double n1;
        n1 = Double.parseDouble(text1.getText());
        if (but1.isSelected())
            resultado = n1 * 0.62137;
        if (but2.isSelected())
            resultado = n1 * 1.8 + 32;
        if (but3.isSelected())
            resultado = n1 * 2.2046;
        res.setText(String.valueOf(resultado));
    }
    
    
}
//Borja Garisoain Brocal PROG10 Ejer01