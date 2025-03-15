package org.example.truthandaction.texts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        String fileName = "Truth.txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream("/" + fileName)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                truths.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getTruths() {
        return truths;
    }



}
