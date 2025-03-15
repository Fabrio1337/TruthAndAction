package org.example.truthandaction.texts;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class TruthTest {

    @Test
    public void afterAddingTextTruthListSizeBecome150()
    {
        Truth truth = new Truth();

        ArrayList<String> truths = truth.getTruths();

        assertEquals(160, truths.size());

    }
  
}