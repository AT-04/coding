package org.fundacionjala.coding.ovidio;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by OvidioMiranda on 5/16/2017.
 */
public final class BankOCR {
    private static final int THREE = 3;
    private static final int MAX_LENGTH = 27;
    private static final int ELEVEN = 11;
    private static final Map<String, String> NUMBERS = new HashMap<String, String>() {
        {
            put(" _ | ||_|", "0");
            put("     |  |", "1");
            put(" _  _||_ ", "2");
            put(" _  _| _|", "3");
            put("   |_|  |", "4");
            put(" _ |_  _|", "5");
            put(" _ |_ |_|", "6");
            put(" _   |  |", "7");
            put(" _ |_||_|", "8");
            put(" _ |_| _|", "9");
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
        String newString;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < MAX_LENGTH; i = i + THREE) {
            int j = i + THREE;
            newString = String.format("%s%s%s", row[0].substring(i, j), row[1].substring(i, j), row[2].substring(i, j));
            stringBuilder.append(getNumberValue(newString));
        }
        return stringBuilder.toString();
    }

    /**
     * @param digit is Value.
     * @return number.
     */
    public static String getNumberValue(String digit) {
        return NUMBERS.get(digit) == null ? "?" : NUMBERS.get(digit);
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
            return String.format("%s%s", number, " ILL");
        }
        return validateAccountNumber(number) ? number : String.format("%s%s", number, " ERR");
    }
}
