package org.fundacionjala.coding;

import org.fundacionjala.coding.ovidio.BanckOCR;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by OvidioMiranda on 5/16/2017.
 */
public class BanckOCRTest {

    //http://codingdojo.org/kata/BankOCR/
    /*
    @Test
    public void testBanckOCRStoryOne(){
        String entry="    _  _     _  _  _  _  _ " +
                     "  | _| _||_||_ |_   ||_||_|" +
                     "  ||_  _|  | _||_|  ||_| _|";

        String expectedResult="123456789";
        //Assert.assertEquals(expectedResult,BanckOCR.convertyEntryToNumber(entry));
    }
    */
    @Test
    public void isValueEqualOne()
    {
        String entryOneNumber="   "+
                              "  |"+
                              "  |";
        String expectedResult="1";
        Assert.assertEquals(expectedResult, BanckOCR.convertyEntryToNumber(entryOneNumber));
    }


    @Test
    public void isValueEqualTwo()
    {
        String entryOneNumber=" _ "+
                              " _|"+
                              "|_ ";
        String expectedResult="2";
        Assert.assertEquals(expectedResult,BanckOCR.convertyEntryToNumber(entryOneNumber));
    }
    @Test
    public void isValueEqualTree()
    {
        String entryOneNumber=" _ " +
                              " _|" +
                              " _|";
        String expectedResult="3";
        Assert.assertEquals(expectedResult,BanckOCR.convertyEntryToNumber(entryOneNumber));
    }
    @Test
    public void isValueEqualFour()
    {
        String entryOneNumber="   " +
                              "|_|" +
                              "  |";
        String expectedResult="4";
        Assert.assertEquals(expectedResult,BanckOCR.convertyEntryToNumber(entryOneNumber));
    }

    @Test
    public void isValueEqualFive()
    {
        String entryOneNumber=" _ " +
                              "|_ " +
                              " _|";
        String expectedResult="5";
        Assert.assertEquals(expectedResult,BanckOCR.convertyEntryToNumber(entryOneNumber));
    }

    @Test
    public void isValueEqualSix()
    {
        String entryOneNumber=" _ " +
                              "|_ " +
                              "|_|";
        String expectedResult="6";
        Assert.assertEquals(expectedResult,BanckOCR.convertyEntryToNumber(entryOneNumber));
    }

    @Test
    public void isValueEqualSeven()
    {
        String entryOneNumber="_ " +
                              " |" +
                              " |";
        String expectedResult="7";
        Assert.assertEquals(expectedResult,BanckOCR.convertyEntryToNumber(entryOneNumber));
    }

    @Test
    public void isValueEqualEight()
    {
        String entryOneNumber=" _ " +
                              "|_|" +
                              "|_|";
        String expectedResult="8";
        Assert.assertEquals(expectedResult,BanckOCR.convertyEntryToNumber(entryOneNumber));
    }

    @Test
    public void isValueEqualNine()
    {
        String entryOneNumber=" _ " +
                              "|_|" +
                              " _|";
        String expectedResult="9";
        Assert.assertEquals(expectedResult,BanckOCR.convertyEntryToNumber(entryOneNumber));
    }

    @Test
    public void isValueEqualAlfabet()
    {
        String entryOneNumber=" _ " +
                              "| |" +
                              " _|";
        String expectedResult="Invalid";
        Assert.assertEquals(expectedResult,BanckOCR.convertyEntryToNumber(entryOneNumber));
    }



}
