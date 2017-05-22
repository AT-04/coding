package org.fundacionjala.coding.abel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AbelBarrientos on 5/22/2017.
 */
public class ReadFileTest {


    /**
     *
     */
    @Test
    public void testCanReadATxtFile() {
        String fileName = "src/test/resources/123456789.txt";

        String expectedResult =  "    _  _     _  _  _  _  _ "
                               + "  | _| _||_||_ |_   ||_||_|"
                               + "  ||_  _|  | _||_|  ||_| _|";
        ReadFile readFile = new ReadFile();

        assertEquals(expectedResult, readFile.read(fileName));
    }
}
