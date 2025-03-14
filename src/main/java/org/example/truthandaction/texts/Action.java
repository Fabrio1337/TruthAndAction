package org.example.truthandaction.texts;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Action {
    private ArrayList<String> actions;

    public Action() {
        loadTextFromFile();
    }

    private void loadTextFromFile()
    {
        try
        {
            List<String> text = Files.readAllLines(Paths.get("Action.txt"));
            actions.addAll(text);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> getActions() {
        return actions;
    }


}
