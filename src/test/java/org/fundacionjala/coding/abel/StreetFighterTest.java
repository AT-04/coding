package org.fundacionjala.coding.abel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

/**
 * Class to run Test for Street Fighter.
 */
public class StreetFighterTest {

    private static final String[][] FIGHTERS = new String[][]{
            new String[]{"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
            new String[]{"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"},
    };

    /**
     * Test for Private Constructors.
     *
     * @throws NoSuchMethodException     Thrown when a particular method cannot be found.
     * @throws IllegalAccessException    Thrown when an application tries to reflectively create an instance.
     * @throws InvocationTargetException thrown by an invoked method or constructor.
     * @throws InstantiationException    Thrown when an application tries to create an instance of a class
     *                                   using the {@code newInstance} method in class.
     */
    @Test
    public void privateConstructorTest() throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Constructor<StreetFighter> constructor = StreetFighter.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * First Test.
     */
    @Test
    public void shouldWorkWithNoMoves() {
        String[] solution = new String[]{};
        assertArrayEquals(solution, StreetFighter.streetFighterSelection(FIGHTERS, new int[]{0, 0}, new String[]{}));
    }

    /**
     * First Test.
     */
    @Test
    public void shouldWorkWithFewMoves() {
        String[] moves = new String[]{"up", "left", "right", "left", "left"};
        String[] solution = new String[]{"Ryu", "Vega", "Ryu", "Vega", "Balrog"};
        assertArrayEquals(solution, StreetFighter.streetFighterSelection(FIGHTERS, new int[]{0, 0}, moves));
    }

    /**
     * First Test.
     */
    @Test
    public void shouldWorkWhenAlwaysMovingLeft() {
        String[] moves = new String[]{"left", "left", "left", "left", "left", "left", "left", "left"};
        String[] solution = new String[]{"Vega", "Balrog", "Guile", "Blanka", "E.Honda", "Ryu", "Vega", "Balrog"};
        assertArrayEquals(solution, StreetFighter.streetFighterSelection(FIGHTERS, new int[]{0, 0}, moves));
    }

    /**
     * First Test.
     */
    @Test
    public void shouldWorkWhenAlwaysMovingRight() {
        String[] moves = new String[]{"right", "right", "right", "right", "right", "right", "right", "right"};
        String[] solution = new String[]{"E.Honda", "Blanka", "Guile", "Balrog", "Vega", "Ryu", "E.Honda", "Blanka"};
        assertArrayEquals(solution, StreetFighter.streetFighterSelection(FIGHTERS, new int[]{0, 0}, moves));
    }

    /**
     * First Test.
     */
    @Test
    public void shouldUseAll4DirectionsClockwiseTwice() {
        String[] moves = new String[]{"up", "left", "down", "right", "up", "left", "down", "right"};
        String[] solution = new String[]{"Ryu", "Vega", "M.Bison", "Ken", "Ryu", "Vega", "M.Bison", "Ken"};
        assertArrayEquals(solution, StreetFighter.streetFighterSelection(FIGHTERS, new int[]{0, 0}, moves));
    }

    /**
     * First Test.
     */
    @Test
    public void shouldWorkWhenAlwaysMovingDown() {
        String[] moves = new String[]{"down", "down", "down", "down"};
        String[] solution = new String[]{"Ken", "Ken", "Ken", "Ken"};
        assertArrayEquals(solution, StreetFighter.streetFighterSelection(FIGHTERS, new int[]{0, 0}, moves));
    }

    /**
     * First Test.
     */
    @Test
    public void shouldWorkWhenAlwaysMovingUp() {
        String[] moves = new String[]{"up", "up", "up", "up"};
        String[] solution = new String[]{"Ryu", "Ryu", "Ryu", "Ryu"};
        assertArrayEquals(solution, StreetFighter.streetFighterSelection(FIGHTERS, new int[]{0, 0}, moves));
    }
}
