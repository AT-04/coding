package org.fundacionjala.coding.richardseverich;

import java.util.ArrayList;

/**
 * Created by Richard on 6/4/2017.
 */
public class BankOCR {

    private static final int ELEVEN = 11;
    private static final int TEEN = 10;
    private static final int NINE = 9;
    private static final int EIGHT = 8;
    private static final int SEVEN = 7;
    private static final int THREE = 3;
    private static final int TWO = 2;
    private static final int ONE = 1;
    private static final int ZERO = 0;
    private static final String QUESTION_MARK = "?";

    private ArrayList<StringBuilder> num = new ArrayList<>();
    private String[] numDynamic = new String[NINE];
    private String[] numStatic = {" _ | ||_|", "     |  |", " _  _||_ ", " _  _| _|", "   |_|  |",
            " _ |_  _|", " _ |_ |_|", " _   |  |", " _ |_||_|", " _ |_| _|"};

    /**
     * This method is the constructor.
     */
    public BankOCR() {
    }

    /**
     * @param entryLine1 Is the string which will be analyzed.
     * @param entryLine2 Is the string which will be analyzed.
     * @param entryLine3 TIs the string which will be analyzed.
     * @return Returns a string with numbers.
     */
    public String convertEntryToNumber(String entryLine1, String entryLine2, String entryLine3) {
        StringBuilder resultNumber = new StringBuilder();
        extractString(entryLine1);
        extractString(entryLine2);
        extractString(entryLine3);
        for (int i = 0; i < NINE; i++) {
            boolean band = true;
            for (int j = 0; j < TEEN; j++) {
                if (numDynamic[i].equals(numStatic[j])) {
                    resultNumber.append(String.valueOf(j));
                    band = false;
                }
            }
            resultNumber = (band) ? resultNumber.append(QUESTION_MARK) : resultNumber.append("");
        }
        return resultNumber.toString();
    }

    /**
     * @param num Is the number already converted.
     * @return Returns the number with Err, ILL.
     */
    public String identifyErrOrIll(String num) {
        StringBuilder resultNumber = new StringBuilder();
        resultNumber.append(num);
        if (num.contains(QUESTION_MARK)) {
            resultNumber.append(" ILL");
        } else if (!isValidChecksum(num)) {
            resultNumber.append(" ERR");
        }
        return resultNumber.toString();
    }

    /**
     * @param num It is the number that we will verify if it is valid.
     * @return If it is valid returns True if not False.
     */
    public boolean isValidChecksum(String num) {
        int checkSum = Integer.parseInt(num.substring(EIGHT, NINE));
        int band = TWO;
        for (int i = SEVEN; 0 <= i; i--) {
            checkSum += (Integer.parseInt(num.substring(i, i + ONE)) * (band));
            band++;
        }
        return checkSum % ELEVEN == 0;
    }

    /**
     * @param entryLine Combine an entry line into numbers.
     */
    private void extractString(String entryLine) {
        int j = ZERO;
        for (int i = 0; i < NINE; i++) {
            num.add(new StringBuilder());
            numDynamic[i] = num.get(i).append(entryLine.substring(j, j + THREE)).toString();
            j += THREE;
        }
    }
}
