package org.fundacionjala.coding.marcoslara;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marcos Lara on 5/19/2017.
 */
public final class BankOCR {

    private static final int CHAR_LONG = 3;
    private static final int LINE_LIMIT = 27;
    private static final int CHECKSUM_DIVIDEND = 11;
    private static final String QUESTION_MARK = "?";
    private static final String ILLEGIBLE_MARK = " ILL";
    private static final String ERROR_MARK = " ERR";
    private static final Map<String, String> DIGITS = new HashMap<String, String>() {
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
     * Private constructor required. These kind of classes are more like tools/utilities than being meant for objects.
     */
    private BankOCR() {

    }

    /**
     * This method convert the scan String to a .
     *
     * @param scan The input scan String.
     * @return A account number in String format.
     */
    public static String convertToNumber(String scan) {
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < LINE_LIMIT; i += CHAR_LONG) {
            StringBuilder number = new StringBuilder();
            number.append(scan.substring(i, i + CHAR_LONG));
            number.append(scan.substring(i + LINE_LIMIT, i + LINE_LIMIT + CHAR_LONG));
            number.append(scan.substring(i + LINE_LIMIT * 2, i + LINE_LIMIT * 2 + CHAR_LONG));
            accountNumber.append(DIGITS.get(number.toString()) == null ? "?" : DIGITS.get(number.toString()));
        }
        return accountNumber.toString();
    }

    /**
     * This method validates de Checksum of a account number in String format.
     *
     * @param accountNumber A account number in String format.
     * @return A boolean value that represents the checksum validation.
     */
    public static boolean validateChecksum(String accountNumber) {
        int addition = 0;
        for (int i = accountNumber.length() - 1; i >= 0; i--) {
            addition += Character.getNumericValue(accountNumber.charAt(i)) * (accountNumber.length() - i);
        }
        return addition % CHECKSUM_DIVIDEND == 0;
    }

    /**
     * This method validates that a account number is valid, illegible or invalid.
     *
     * @param scan The input scan String.
     * @return A string that includes the account number and a mark in case of illegibility o invalidity.
     */
    public static String validateAccountNumber(String scan) {
        String numberAccount = convertToNumber(scan);
        if (convertToNumber(scan).contains(QUESTION_MARK)) {
            return String.join("", numberAccount, ILLEGIBLE_MARK);
        }
        return validateChecksum(numberAccount) ? numberAccount : String.join("", numberAccount, ERROR_MARK);
    }
}
