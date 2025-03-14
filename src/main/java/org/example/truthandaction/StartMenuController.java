package org.example.truthandaction;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StartMenuController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void initialize() {
        welcomeText.setText("Добро пожаловать в игру 'Правда или Действие!'");
    }

    @FXML
    protected void WelcomeButton() {

    }
}