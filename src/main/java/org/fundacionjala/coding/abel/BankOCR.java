package org.fundacionjala.coding.abel;

import java.util.Arrays;
import java.util.List;

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

        String[] positionNumbers = getPositionNumbers(charArray);

        StringBuffer stringBuffer = new StringBuffer();

        for (String string: positionNumbers) {
            stringBuffer.append(checkString(string));
        }

        return stringBuffer.toString();
    }

    /**
     *
     * @param charArray parameter
     * @return String[]
     */
    private static String[] getPositionNumbers(char[] charArray) {
        String[] positionNumbers = new String[TOTAL_CHARS];

        for (int i = 0; i < TOTAL_CHARS; i++) {
            positionNumbers[i] = extractNumbers(charArray, i);
        }

        return positionNumbers;
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

        return String.valueOf(result.getIntValue());
    }

    /**
     *
     * @param charArray parameter
     * @param position parameter
     * @return String
     */
    private static String extractNumbers(char[] charArray, int position) {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(charArray[FIRST_LINE_AT_ZERO + position * CHAR_LENGTH]);
        stringBuffer.append(charArray[FIRST_LINE_AT_ONE + position * CHAR_LENGTH]);
        stringBuffer.append(charArray[FIRST_LINE_AT_TWO + position * CHAR_LENGTH]);
        stringBuffer.append(charArray[SECOND_LINE_AT_ZERO + position * CHAR_LENGTH]);
        stringBuffer.append(charArray[SECOND_LINE_AT_ONE + position * CHAR_LENGTH]);
        stringBuffer.append(charArray[SECOND_LINE_AT_TWO + position * CHAR_LENGTH]);
        stringBuffer.append(charArray[THIRD_LINE_AT_ZERO + position * CHAR_LENGTH]);
        stringBuffer.append(charArray[THIRD_LINE_AT_ONE + position * CHAR_LENGTH]);
        stringBuffer.append(charArray[THIRD_LINE_AT_TWO + position * CHAR_LENGTH]);

        return stringBuffer.toString();
    }
}
