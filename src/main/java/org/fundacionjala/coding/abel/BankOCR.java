package org.fundacionjala.coding.abel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
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
    public static final int TOTAL_CHARS = 9;
    public static final int CHAR_LENGTH = 3;
    public static final int FIRST_LINE_AT_ZERO = 0;
    public static final int FIRST_LINE_AT_ONE = 1;
    public static final int FIRST_LINE_AT_TWO = 2;
    public static final int SECOND_LINE_AT_ZERO = 27;
    public static final int SECOND_LINE_AT_ONE = 28;
    public static final int SECOND_LINE_AT_TWO = 29;
    public static final int THIRD_LINE_AT_ZERO = 54;
    public static final int THIRD_LINE_AT_ONE = 55;
    public static final int THIRD_LINE_AT_TWO = 56;
    public static final int ELEVEN = 11;

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
        char[] charArray = entry.toCharArray();

        String[] positionNumbers = numbersByPosition(charArray);

        StringBuilder stringBuilder = new StringBuilder();

        for (String string: positionNumbers) {
            stringBuilder.append(checkString(string));
        }

        return stringBuilder.toString();
    }

    /**
     *
     * @param charArray parameter
     * @return String[]
     */
    private static String[] numbersByPosition(char[] charArray) {
        String[] numbersByPosition = new String[TOTAL_CHARS];

        for (int i = 0; i < TOTAL_CHARS; i++) {
            numbersByPosition[i] = extractNumbers(charArray, i);
        }

        return numbersByPosition;
    }

    /**
     *
     * @param string parameter
     * @return String
     */
    private static String checkString(String string) {
        String result = "";
        for (int i = 0; i < TOTAL_CHARS; i++) {
            result = getNumberValue(string);
        }
        return result;
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
     * @param charArray parameter
     * @param position parameter
     * @return String
     */
    private static String extractNumbers(char[] charArray, int position) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(charArray[FIRST_LINE_AT_ZERO + position * CHAR_LENGTH]);
        stringBuilder.append(charArray[FIRST_LINE_AT_ONE + position * CHAR_LENGTH]);
        stringBuilder.append(charArray[FIRST_LINE_AT_TWO + position * CHAR_LENGTH]);
        stringBuilder.append(charArray[SECOND_LINE_AT_ZERO + position * CHAR_LENGTH]);
        stringBuilder.append(charArray[SECOND_LINE_AT_ONE + position * CHAR_LENGTH]);
        stringBuilder.append(charArray[SECOND_LINE_AT_TWO + position * CHAR_LENGTH]);
        stringBuilder.append(charArray[THIRD_LINE_AT_ZERO + position * CHAR_LENGTH]);
        stringBuilder.append(charArray[THIRD_LINE_AT_ONE + position * CHAR_LENGTH]);
        stringBuilder.append(charArray[THIRD_LINE_AT_TWO + position * CHAR_LENGTH]);

        return stringBuilder.toString();
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
