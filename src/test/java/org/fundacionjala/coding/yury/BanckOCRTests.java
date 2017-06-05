package org.fundacionjala.coding.yury;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by YuryOrtuno on 5/22/2017.
 */
public class BanckOCRTests {

    private BanckOCR bank;

    @Before
    public void before() {
        BanckOCR bank = new BanckOCR();
    }


    @Test
    public void testBankOCRStoryOneTestFrom1To9() {
        String entry = "    _  _     _  _  _  _  _ " +
                "  | _| _||_||_ |_   ||_||_|" +
                "  ||_  _|  | _||_|  ||_| _|";

        Assert.assertEquals("123456789", bank.convertEntryToNumber(entry));
    }

    @Test
    public void testBankOCRStoryTwo() {
        
    }


}
