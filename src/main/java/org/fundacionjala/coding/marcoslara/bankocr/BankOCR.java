package org.fundacionjala.coding.marcoslara.bankocr;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marcos Lara on 5/19/2017.
 */
public class BankOCR {

    private static int CHAR_LONG = 3;
    private static int LINE_LIMIT = 27;
    private static Map<String, String> DIGITS = new HashMap<String, String>() {
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

    public static boolean validateChecksum(String accountNumber){

        return false;
    }
}
