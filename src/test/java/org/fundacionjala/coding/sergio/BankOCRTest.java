package org.fundacionjala.coding.Sergio;

import org.junit.Assert;
import org.junit.Test;

import static org.fundacionjala.coding.sergio.BankORC.convertEntryToNumber;

/**
 * Created by Administrator on 5/16/2017.
 */
public class BankORCTest {
    /**
     * hgsdhsdds.
     */
    @Test
    public void comprobateEntryNumbersOneToZero() {
       // BankORC x = new BankORC();
        String firstLine = "    _  _     _  _  _  _  _  _ ";
        String secondLine = "  | _| _||_||_ |_   ||_||_|| |";
        String thirdLine = "  ||_  _|  | _||_|  ||_| _||_|";
        Assert.assertEquals("1234567890", convertEntryToNumber(firstLine, secondLine, thirdLine));
    }
}
