package org.example.truthandaction;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StartMenuController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}