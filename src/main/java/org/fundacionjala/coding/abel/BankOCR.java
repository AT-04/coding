package org.fundacionjala.coding;

/**
 * Created by Administrator on 5/19/2017.
 */
public class BankOCR {
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

    private static final String[] ALL_NUMBERS = {ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE};

    public static String convertEntryToNumber(String entry) {
        char[] charArray = entry.toCharArray();

        String[] positionNumbers = getPositionNumbers(charArray);

        String result = "";

        for (String string: positionNumbers)
        {
            result += checkString(string);
        }

        return result;
    }

    private static String[] getPositionNumbers(char[] charArray){
        String[] positionNumbers = new String[9];

        for (int i = 0; i < 9; i++)
        {
            positionNumbers[i] = extractNumbers(charArray, i);
        }

        return positionNumbers;
    }

    private static String checkString(String string) {
        String result = "";
        for (int i = 0; i < 9; i++)
        {
            result = getNumberValue(string);
        }
        return result;
    }

    private static String getNumberValue(String string) {
        String result = "";
        for (int j = 0; j < ALL_NUMBERS.length; j++)
        {
            if(string.equals(ALL_NUMBERS[j]))
                result = String.valueOf(j);
        }
        return result;
    }


    private static String extractNumbers(char[] charArray, int position) {
        return  charArray[0 + position * 3] + "" + charArray[1 + position * 3] + "" + charArray[2 + position * 3] + "" +
                charArray[27 + position * 3] + "" + charArray[28 + position * 3] + "" + charArray[29 + position * 3] + "" +
                charArray[54 + position * 3] + "" + charArray[55 + position * 3] + "" + charArray[56 + position * 3];
    }
}
