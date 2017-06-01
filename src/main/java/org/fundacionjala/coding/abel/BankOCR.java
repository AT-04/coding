package org.fundacionjala.coding.abel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    private static final List<Number> ALL_NUMBERS = Arrays.asList(
            new Number(ZERO, 0),
            new Number(ONE, 1),
            new Number(TWO, 2),
            new Number(THREE, 3),
            new Number(FOUR, 4),
            new Number(FIVE, 5),
            new Number(SIX, 6),
            new Number(SEVEN, 7),
            new Number(EIGHT, 8),
            new Number(NINE, 9));
    private static final int TOTAL_CHARS = 9;
    private static final int CHAR_LENGTH = 3;
    private static final int FIRST_LINE_AT_ZERO = 0;
    private static final int FIRST_LINE_AT_THREE = 3;
    private static final int SECOND_LINE_AT_ZERO = 27;
    private static final int SECOND_LINE_AT_THREE = 30;
    private static final int THIRD_LINE_AT_ZERO = 54;
    private static final int THIRD_LINE_AT_THREE = 57;
    private static final int ELEVEN = 11;

    private static List<String> stringNumbers;

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
        stringNumbers = new ArrayList<>();
        for (int i = 0; i < TOTAL_CHARS; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(entry.substring(FIRST_LINE_AT_ZERO + i * CHAR_LENGTH,
                    FIRST_LINE_AT_THREE + i * CHAR_LENGTH));
            stringBuilder.append(entry.substring(SECOND_LINE_AT_ZERO + i * CHAR_LENGTH,
                    SECOND_LINE_AT_THREE + i * CHAR_LENGTH));
            stringBuilder.append(entry.substring(THIRD_LINE_AT_ZERO + i * CHAR_LENGTH,
                    THIRD_LINE_AT_THREE + i * CHAR_LENGTH));
            stringNumbers.add(stringBuilder.toString());
        }
        return stringNumbers.stream()
                .map(number -> getNumberValue(number))
                .collect(Collectors.joining());
    }

    /**
     *
     * @param string parameter
     * @return String
     */
    private static String getNumberValue(String string) {
        Number result = ALL_NUMBERS.stream()
                .filter(number -> string.equals(number.getStringRepresentation()))
                .findAny()
                .orElse(null);

        return (result == null) ? "?" : String.valueOf(result.getIntValue());
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
            stream.forEach(st -> stringBuilder.append(st));

            return stringBuilder.toString();
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }

    /**
     *
     * @param accountNumber param
     * @return Boolean
     */
    public static boolean validateAccountNumber(String accountNumber) {
        if (accountNumber.contains("?")) {
            return false;
        }
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
        return (validateAccountNumber(entryToNumber)) ? entryToNumber : ((entryToNumber.contains("?"))
                ? String.join("", entryToNumber, " ILL")
                : String.join("", entryToNumber, " ERR"));
    }
}
