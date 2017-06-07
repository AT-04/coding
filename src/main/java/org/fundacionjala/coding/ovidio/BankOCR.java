package org.fundacionjala.coding.ovidio;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by OvidioMiranda on 5/16/2017.
 */
public class BanckOCR {
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
        private static final int NUMBER_DIGITS = 9;
        private static final int FIRST_LINE = 27;
        private static final int SECOND_LINE = 54;
        private static final int LONG_LINE = 3;
        private static final int MODULO = 11;
        private static final Map<String, Integer> STRING_NUMBERS = new HashMap<String, Integer>() {
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
        private BanckOCR() {
        }

        /**
         * @param stringNumber string with the code of the number for example(" _ |_| _|")
         * @return String the value the number
         */
        public static String convertNumber(String stringNumber) {
            String firstLine = stringNumber.substring(0, FIRST_LINE);
            String secondLine = stringNumber.substring(FIRST_LINE, SECOND_LINE);
            String thirdLine = stringNumber.substring(SECOND_LINE);
            int positionFrom = 0;
            int positionTo = LONG_LINE;
            StringBuffer number = new StringBuffer();
            for (int i = 1; i <= NUMBER_DIGITS; i++) {
                String digit = firstLine.substring(positionFrom, positionTo)
                        + secondLine.substring(positionFrom, positionTo) + thirdLine.substring(positionFrom, positionTo);
                positionFrom = positionTo;
                positionTo = positionTo + LONG_LINE;
                number = number.append(getNumberValue(digit));
            }
            return number.toString();
        }


        /**
         * @param digit code of the number for example(" _ |_| _|")
         * @return String the value the number
         */
        private static String getNumberValue(String digit) {
            Integer number = STRING_NUMBERS.get(digit);
            return number == null ? "?" : number.toString();
        }

        /**
         * @param number number convert.
         * @return String if is valid number return the number if not return number with "ERR".
         */
        private static boolean validNumber(String number) {
            int checksum = 0;
            for (int i = 1; i <= number.length(); i++) {
                checksum += Integer.parseInt(String.valueOf(number.charAt(number.length() - i))) * i;
            }
            return checksum % MODULO == 0;
        }

        /**
         * @param number number convert.
         * @return String if contain "?" return number with "ILL" if not number or Number with "ERR"
         */
        public static String output(String number) {
            if (number.contains("?")) {
                return number.concat(" ILL");
            }
            return validNumber(number) ? number : number.concat(" ERR");
        }
    }