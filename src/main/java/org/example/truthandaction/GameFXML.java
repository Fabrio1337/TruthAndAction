package org.example.truthandaction;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GameFXML{
    private Stage stage = new Stage();

    public void setDisplay() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartMenu.class.getResource("/Game.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Правда или Действие");
        stage.setScene(scene);
        stage.show();
    }
}
