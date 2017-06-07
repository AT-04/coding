package org.fundacionjala.coding.ovidio;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by OvidioMiranda on 5/16/2017.
 */
public final class BankOCR {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;
    private static final int NINE = 9;
    private static final int MAX_LENGTH = 27;
    private static final int ELEVEN = 11;
    private static final Map<String, Integer> NUMBERS = new HashMap<String, Integer>() {
        {
            put(" _ | ||_|", ZERO);
            put("     |  |", ONE);
            put(" _  _||_ ", TWO);
            put(" _  _| _|", THREE);
            put("   |_|  |", FOUR);
            put(" _ |_  _|", FIVE);
            put(" _ |_ |_|", SIX);
            put(" _   |  |", SEVEN);
            put(" _ |_||_|", EIGHT);
            put(" _ |_| _|", NINE);
        }
    };

    /**
     * Constructor.
     */
    private BankOCR() {
    }

    /**
     * @param entry parameter.
     * @return String.
     */
    public static String convertEntryToNumber(String entry) {
        String[] row = getLinesTheEntry(entry);
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < MAX_LENGTH; i = i + THREE) {
            int j = i + THREE;
            finalString.append(getNumberValue(row[0].substring(i, j)
                    + row[1].substring(i, j) + row[2].substring(i, j)));
        }
        return finalString.toString();
    }

    /**
     * @param stringNumber parameter.
     * @return Array the String.
     */
    private static String[] getLinesTheEntry(String stringNumber) {
        final int numberRows = 4;
        String[] row = new String[numberRows];
        int cont = 0;
        for (String line : stringNumber.split("(?<=\\G.{27})")) {
            row[cont] = line;
            cont++;
        }
        return row;
    }


    /**
     * @param digit parameter.
     * @return String.
     */
    private static String getNumberValue(String digit) {
        Integer number = NUMBERS.get(digit);
        return number == null ? "?" : number.toString();
    }

    /**
     * @param accountNumber parameter.
     * @return boolean.
     */
    private static boolean validateAccountNumber(String accountNumber) {
        int checksum = 0;
        for (int i = 1; i <= accountNumber.length(); i++) {
            checksum += Integer.parseInt(String.valueOf(accountNumber.charAt(accountNumber.length() - i))) * i;
        }
        return checksum % ELEVEN == 0;
    }

    /**
     * @param number parameter.
     * @return String.
     */
    public static String lineOutPut(String number) {
        if (number.contains("?")) {
            return String.join("", number, " ILL");
        }
        return validateAccountNumber(number) ? number : String.join("", number, " ERR");
    }

}
