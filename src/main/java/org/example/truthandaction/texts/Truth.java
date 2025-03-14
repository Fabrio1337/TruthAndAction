package org.example.truthandaction.texts;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Truth {
    private ArrayList<String> truths = new ArrayList<>();

    public Truth() {
        loadTextFromFile();
    }

    private void loadTextFromFile()
    {
        try
        {
            List<String> text = Files.readAllLines(Paths.get("Truth.txt"));
            truths.addAll(text);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> getTruths() {
        return truths;
    }



}
