package org.example.truthandaction.texts;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Component("actionText")
public class Action {
    private ArrayList<String> actions = new ArrayList<>();

    public Action() {
        loadTextFromFile();
    }

    private void loadTextFromFile()
    {
        String fileName = "Action.txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream("/" + fileName))))  {
            String line;
            while ((line = reader.readLine()) != null) {
                actions.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAction(String word) {
        return word;
    }

    public ArrayList<String> getActions() {
        return actions;
    }


}
