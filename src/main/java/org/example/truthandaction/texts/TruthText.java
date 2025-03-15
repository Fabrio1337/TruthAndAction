package org.example.truthandaction.texts;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

@Component
public class TruthText {
    private ArrayList<String> truths = new ArrayList<>();

    public TruthText() {
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

    public String getTruth(String word) {
        return word;
    }

    public ArrayList<String> getTruths() {
        return truths;
    }



}
