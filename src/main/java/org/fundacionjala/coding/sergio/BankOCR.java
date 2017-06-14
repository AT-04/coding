package org.fundacionjala.coding.sergio;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 5/16/2017.
 */
final class BankOCR {
    private static final int THREE = 3;
    private static final int TWO = 2;
    private static final int NINE = 9;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;
    private static final int MAXLENGTH = 27;
    private static final int ZEROCONDITION = 0;
    private static final int CHECKSUMCONDITION = 11;
    private static final int ONE = 1;
    private static final String S_ERR = "%s ERR";
    private static final String S_ILL = "%s ILL";
    private static final String NON_VALID_NUMBER = "?";
    private static Map<String, Integer> Number;

    static {
        Number = new HashMap<>();
        Number.put("   "
                + "  |"
                + "  |", ONE);
        Number.put(" _ "
                + " _|"
                + "|_ ", TWO);
        Number.put(" _ "
                + " _|"
                + " _|", THREE);
        Number.put("   "
                + "|_|"
                + "  |", FOUR);
        Number.put(" _ "
                + "|_ "
                + " _|", FIVE);
        Number.put(" _ "
                + "|_ "
                + "|_|", SIX);
        Number.put(" _ "
                + "  |"
                + "  |", SEVEN);
        Number.put(" _ "
                + "|_|"
                + "|_|", EIGHT);
        Number.put(" _ "
                + "|_|"
                + " _|", NINE);
        Number.put(" _ "
                + "| |"
                + "|_|", 0);
    }

    /**
     * CONSTRUCTOR.
     */
    private BankOCR() {
    }

    /**
     * @param line1 IS THE FIRST LINE OF ENTRY.
     * @param line2 IS THE SECOND LINE OF ENTRY.
     * @param line3 IS THE THIRD LINE OF ENTRY.
     * @return THE NUMBER OF MAP IND.
     */
    static String convertEntryToNumber(String line1, String line2, String line3) {
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < MAXLENGTH; i = i + THREE) {
            int j = i + THREE;
            finalString.append(Number.get(line1.substring(i, j) + line2.substring(i, j) + line3.substring(i, j)));
        }
        return finalString.toString();
    }

    /**
     * @param number is the a/c #.
     * @return if the a/c is valid or not.
     */
    static boolean validationCheckSum(String number) {
        String[] num = new StringBuilder(number).reverse().toString().split("");
        int checkSum = 0;
        for (int i = 0; i < number.length(); i++) {
            checkSum += (i + ONE) * Integer.parseInt(num[i]);
        }
        return checkSum % CHECKSUMCONDITION == ZEROCONDITION;
    }

    /**
     * @param entry String entry.
     * @return The comparation.
     */
    static String errorAccount(String entry) {
        if (entry.contains(NON_VALID_NUMBER)) {
            return String.format(S_ILL, entry);
        }
        return !validationCheckSum(entry) ? String.format(S_ERR, entry) : entry;
    }
}
