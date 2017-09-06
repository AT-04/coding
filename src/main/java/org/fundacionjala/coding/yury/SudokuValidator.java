package org.fundacionjala.coding.yury;


import java.util.Arrays;

/**
 * Created by yuryy on 6/9/2017.
 */
public class SudokuValidator {
    private static final int[] complete = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static boolean check(int[][] sudoku) {
        int[] row = new int[9], col = new int[9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                row[j] = sudoku[i][j];
                col[j] = sudoku[j][i];
            }
            Arrays.sort(row);
            Arrays.sort(col);
            if (!Arrays.equals(row, complete) || !Arrays.equals(col, complete)) {
                return false;
            }
        }
        return true;
    }
}
