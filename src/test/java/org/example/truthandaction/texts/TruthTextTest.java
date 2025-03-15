package org.example.truthandaction.texts;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class TruthTextTest {

    @Test
    public void afterAddingTextTruthListSizeBecome150()
    {
        TruthText truthText = new TruthText();

        ArrayList<String> truths = truthText.getTruths();

        assertEquals(160, truths.size());

    }
  
}