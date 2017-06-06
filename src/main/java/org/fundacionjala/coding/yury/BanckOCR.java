package org.fundacionjala.coding.yury;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by YuryOrtuno on 5/22/2017.
 */
public class BanckOCR {
    public static final int MAX_PASSWORD_SIZE = 27;
    public static final int SPACE = 3;
    public static final int LINE2 = 27;
    public static final int LINE3 = 54;
    public static final int MODULE = 11;
    private static Map<String, String> map = new HashMap<>();

    /**
     * Constructed for default.
     */
    public BanckOCR() {
        map.put(" _ | ||_|", "0");
        map.put("     |  |", "1");
        map.put(" _  _||_ ", "2");
        map.put(" _  _| _|", "3");
        map.put("   |_|  |", "4");
        map.put(" _ |_  _|", "5");
        map.put(" _ |_ |_|", "6");
        map.put(" _   |  |", "7");
        map.put(" _ |_||_|", "8");
        map.put(" _ |_| _|", "9");
    }

    /**
     * @param input String de number
     * @return number
     */
    public String convert(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < MAX_PASSWORD_SIZE; i = i + SPACE) {
            StringBuilder stringBuilderAux = new StringBuilder();
            stringBuilderAux.append(input.substring(i, i + SPACE));
            stringBuilderAux.append(input.substring(i + LINE2, i + LINE2 + SPACE));
            stringBuilderAux.append(input.substring(i + LINE3, i + LINE3 + SPACE));
            String value;
            value = map.get(stringBuilderAux.toString()) == null ? "?" : map.get(stringBuilderAux.toString());
            stringBuilder.append(value);
        }
        return stringBuilder.toString();
    }

    /**
     * @param input number
     * @return sum number%11
     */
    public int calculateSum(String input) {
        String numbers = input;
        int suma = 0;
        int j = 1;
        for (int i = numbers.length() - 1; i >= 0; i--) {
            int number = Integer.parseInt(numbers.substring(i, i + 1));
            suma += number * j;
            j++;
        }
        return suma % MODULE;
    }

    /**
     * @param input number
     * @return message
     */
    public String check(String input) {
        if (input.contains("?")) {
            return String.format("%s ILL", input);
        }
        return calculateSum(input) == 0 ? input : String.format("%s ERR", input);
    }

    /**
     * @param fileName of the file
     * @return String of the file
     */
    public String readFile(String fileName) {
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
     * @param fileName direction of the file
     * @return solution of exercise
     */
    public String solve(String fileName) {
        String number = convert(readFile(fileName));
        return check(number);
    }
}
