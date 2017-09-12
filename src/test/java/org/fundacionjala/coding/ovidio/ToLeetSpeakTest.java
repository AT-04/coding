package org.fundacionjala.coding.ovidio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Simon on 22/08/2017.
 */
public class ToLeetSpeakTest {
    private ToLeetSpeak toLeetSpeak;

    /**
     * Execute before each test method.
     */
    @Before
    public void setUp() {
        toLeetSpeak = new ToLeetSpeak();
    }

    /**
     * Example Test.
     */
    @Test
    public void testSomething() {
        assertEquals("1337", toLeetSpeak.toLeetSpeak("LEET"));
        assertEquals("(0D3W@R$", toLeetSpeak.toLeetSpeak("CODEWARS"));
        assertEquals("#3110 W0R1D", toLeetSpeak.toLeetSpeak("HELLO WORLD"));
        assertEquals("10R3M !P$UM D010R $!7 @M37", toLeetSpeak.toLeetSpeak("LOREM IPSUM DOLOR SIT AMET"));
        String result = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals("7#3 QU!(K 8R0WN F0X JUMP$ 0V3R 7#3 1@2Y D06", toLeetSpeak.toLeetSpeak(result));
    }
}
