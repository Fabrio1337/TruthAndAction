package org.example.truthandaction;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.truthandaction.texts.Action;
import org.example.truthandaction.texts.TruthText;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Game {
    AnnotationConfigApplicationContext context = SimpleBeansLoader.getContext();

    @FXML
    Label textLabel;

    @FXML
    public void showTruthButton()
    {

        TruthText truthText = context.getBean("truthText", TruthText.class);
        String text = truthText.getTruth("1");
        setRandomText(text);
    }

    @FXML
    public void showActionButton()
    {
        Action action = context.getBean("actionText", Action.class);
        String text = action.getAction("2");
        setRandomText(text);
    }

    public void setRandomText(String text)
    {
       textLabel.setText(text);
    }
}
