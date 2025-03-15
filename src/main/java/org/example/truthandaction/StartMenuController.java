package org.example.truthandaction;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class StartMenuController {
    AnnotationConfigApplicationContext context = SimpleBeansLoader.getContext();

    @FXML
    private Label welcomeText;

    @FXML
    protected void initialize() {
        welcomeText.setText("Добро пожаловать в игру 'Правда или Действие!'");
    }

    @FXML
    protected void WelcomeButton() throws IOException {
       GameFXML gameFXML = context.getBean("gameFXML", GameFXML.class);
       gameFXML.setDisplay();
    }
}