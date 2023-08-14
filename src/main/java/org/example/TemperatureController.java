package org.example;

import javafx.fxml.FXML;
import java.io.IOException;

public class TemperatureController {

    @FXML
    public void backToPrincipal() throws IOException {
        App.setRoot("principal");
    }
}
