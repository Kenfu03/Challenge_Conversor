package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import java.io.IOException;
public class PrincipalController {
    @FXML
    private ChoiceBox<String> choices;

    @FXML
    public void initialize(){
        choices.getItems().addAll("Conversor de monedas","Conversor de temp");

        choices.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            loadConvertor(newValue);
        });
    }
    public void loadConvertor(String option){
        if (option.equals("Conversor de monedas")) {
            try {
                App.setRoot("currency");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (option.equals("Conversor de temp")) {
            try {
                App.setRoot("temperature");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
