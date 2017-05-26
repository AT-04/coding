package org.fundacionjala.coding.sergio;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 5/16/2017.
 */
public final class BankOCR {
    private static final int THREE = 3;
    public static final int NINE = 9;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int MAXLENGTH = 30;
    private static Map<String, Integer> number;
    static {
        number = new HashMap<>();
        number.put("   "
                + "  |"
                + "  |", 1);
        number.put(" _ "
                + " _|"
                + "|_ ", 2);
        number.put(" _ "
                + " _|"
                + " _|", THREE);
        number.put("   "
                + "|_|"
                + "  |", FOUR);
        number.put(" _ "
                + "|_ "
                + " _|", FIVE);
        number.put(" _ "
                + "|_ "
                + "|_|", SIX);
        number.put(" _ "
                + "  |"
                + "  |", SEVEN);
        number.put(" _ "
                + "|_|"
                + "|_|", EIGHT);
        number.put(" _ "
                + "|_|"
                + " _|", NINE);
        number.put(" _ "
                + "| |"
                + "|_|", 0);
    }
    /**
     * CONSTRUCTOR.
     */
    private BankOCR() {
    }

    /**
     *
     * @param line1 IS THE FIRST LINE OF ENTRY
     * @param line2 IS THE SECOND LINE OF ENTRY
     * @param line3 IS THE THIRD LINE OF ENTRY
     * @return THE NUMBER OF MAP IND
     */
    public static String convertEntryToNumber(String line1, String line2, String line3) {
        String finalString = "";
        //int sum = 3;
        //int x = number.size();
        for (int i = 0; i < MAXLENGTH; i = i + THREE) {
           int j = i +  THREE;
            finalString += number.get(line1.substring(i, j) + line2.substring(i, j) + line3.substring(i, j));
        }
        return finalString;
    }
}
