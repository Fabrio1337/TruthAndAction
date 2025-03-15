package org.example.truthandaction.texts;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ActionTest {

    @Test
    public void afterAddingTextAtionListSizeBecome150()
    {
        Action action = new Action();

        ArrayList<String> actions = action.getActions();

        assertEquals(150, actions.size());

    }

}