package org.fundacionjala.coding.abel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by AbelBarrientos on 16/5/2017.
 */
public final class BankOCR {

    private static final String ZERO  = " _ | ||_|";
    private static final String ONE   = "     |  |";
    private static final String TWO   = " _  _||_ ";
    private static final String THREE = " _  _| _|";
    private static final String FOUR  = "   |_|  |";
    private static final String FIVE  = " _ |_  _|";
    private static final String SIX   = " _ |_ |_|";
    private static final String SEVEN = " _   |  |";
    private static final String EIGHT = " _ |_||_|";
    private static final String NINE  = " _ |_| _|";
    private static final int TOTAL_CHARS = 9;
    private static final int CHAR_LENGTH = 3;
    private static final int FIRST_LINE_AT_ZERO = 0;
    private static final int FIRST_LINE_AT_THREE = 3;
    private static final int SECOND_LINE_AT_ZERO = 27;
    private static final int SECOND_LINE_AT_THREE = 30;
    private static final int THIRD_LINE_AT_ZERO = 54;
    private static final int THIRD_LINE_AT_THREE = 57;
    private static final int ELEVEN = 11;
    private static final int INT_ZERO = 0;
    private static final int INT_ONE = 1;
    private static final int INT_TWO = 2;
    private static final int INT_THREE = 3;
    private static final int INT_FOUR = 4;
    private static final int INT_FIVE = 5;
    private static final int INT_SIX = 6;
    private static final int INT_SEVEN = 7;
    private static final int INT_EIGHT = 8;
    private static final int INT_NINE = 9;
    private static final Map<String, Integer> ALL_NUMBERS = new HashMap<String, Integer>() {
        {
            put(ZERO, INT_ZERO);
            put(ONE, INT_ONE);
            put(TWO, INT_TWO);
            put(THREE, INT_THREE);
            put(FOUR, INT_FOUR);
            put(FIVE, INT_FIVE);
            put(SIX, INT_SIX);
            put(SEVEN, INT_SEVEN);
            put(EIGHT, INT_EIGHT);
            put(NINE, INT_NINE);
        }
    };
    public static final String QUESTION_MARK = "?";

    /**
     *
     */
    private BankOCR() {

    }

    /**
     * Read the entry.
     * @param entry is the parameter
     * @return String
     */
    public static String convertEntryToNumber(String entry) {
        List<String> stringNumbers = new ArrayList<>();
        for (int i = 0; i < TOTAL_CHARS; i++) {
            String firstLine = entry.substring(FIRST_LINE_AT_ZERO + i * CHAR_LENGTH,
                    FIRST_LINE_AT_THREE + i * CHAR_LENGTH);
            String secondLine = entry.substring(SECOND_LINE_AT_ZERO + i * CHAR_LENGTH,
                    SECOND_LINE_AT_THREE + i * CHAR_LENGTH);
            String thirdLine = entry.substring(THIRD_LINE_AT_ZERO + i * CHAR_LENGTH,
                    THIRD_LINE_AT_THREE + i * CHAR_LENGTH);
            stringNumbers.add(String.join("", firstLine, secondLine, thirdLine));
        }
        return stringNumbers.stream()
                .map(BankOCR::getNumberValue)
                .collect(Collectors.joining());
    }

    /**
     *
     * @param string parameter
     * @return String
     */
    private static String getNumberValue(String string) {
        Integer result = ALL_NUMBERS.get(string);
        return result == null ? QUESTION_MARK : String.valueOf(result);
    }

    /**
     *
     * @param fileName param
     * @return String
     */
    public static String readFile(String fileName) {
        final StringBuilder stringBuilder = new StringBuilder();
        try {
            Stream<String> stream = Files.lines(Paths.get(fileName));
            stream.forEach(stringBuilder::append);
        } catch (IOException e) {
            System.out.println(e);
        }
        return stringBuilder.toString();
    }

    /**
     *
     * @param accountNumber param
     * @return Boolean
     */
    public static boolean validateAccountNumber(String accountNumber) {
        char[] charArray = new StringBuilder(accountNumber).reverse().toString().toCharArray();
        int sum = 0;
        for (int i = 0; i <= charArray.length - 1; i++) {
            int intValue = Integer.parseInt(String.valueOf(charArray[i]));
            sum += intValue * (i + 1);
        }
        return sum % ELEVEN == 0;
    }

    /**
     *
     * @param entryToNumber param
     * @return String
     */
    public static String lineOutPut(String entryToNumber) {
        if (entryToNumber.contains(QUESTION_MARK)) {
            return String.join("", entryToNumber, " ILL");
        }
        return validateAccountNumber(entryToNumber) ? entryToNumber : String.join("", entryToNumber, " ERR");
    }
}
