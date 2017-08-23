package org.fundacionjala.coding.abel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test class for Bouncing Ball.
 */
public class BouncingBallTest {

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
        Constructor<BouncingBall> constructor = BouncingBall.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * First Test.
     */
    @Test
    public void test1() {
        assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
    }

    /**
     * Second Test.
     */
    @Test
    public void test2() {
        assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
    }
}
