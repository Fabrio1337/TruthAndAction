package org.example.truthandaction;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.stereotype.Component;

public class Game {

    @FXML
    Label textLabel;

    @FXML
    protected void showTruthButton()
    {
        setRandomText(".");
    }

    @FXML
    protected void showActionButton()
    {
        setRandomText(".");
    }

    public void setRandomText(String text)
    {
       textLabel.setText(text);
    }
}
