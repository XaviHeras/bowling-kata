package com.drpicox.bowlingKata;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class BowlingGameTest extends TestCase {

    public void testGutterGame() throws Exception {
        Game g = new Game();
        for (int i = 0; i < 20; i++)
            g.roll(0);
        assertEquals(0, g.score());
    }

    public void testAllOnes() throws Exception {
        Game g = new Game();
        for (int i = 0; i < 20; i++)
            g.roll(1);
        assertEquals(20, g.score());
    }


}
