package org.fundacionjala.coding.abel;

import java.util.ArrayList;
import java.util.List;

/**
 * You'll have to simulate the video game's character selection screen behaviour, more specifically the selection grid.
 * Such screen looks like this:
 * Selection Grid Layout in text:
 * | Ryu  | E.Honda | Blanka  | Guile   | Balrog | Vega    |
 * | Ken  | Chun Li | Zangief | Dhalsim | Sagat  | M.Bison |
 * Input
 * the list of game characters in a 2x6 grid;
 * the initial position of the selection cursor (top-left is (0,0));
 * a list of moves of the selection cursor (which are up, down, left, right);
 * Output
 * the list of characters who have been hovered by the selection cursor after all the moves
 * (ordered and with repetition, all the ones after a move, wether successful or not, see tests);
 */
public final class StreetFighter {

    /**
     * Private Constructor.
     */
    private StreetFighter() {

    }

    /**
     * Returns the Fighter after pushing buttons.
     *
     * @param fighters String[][].
     * @param position int[].
     * @param moves    String[].
     * @return String[].
     */
    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
        String[] solution = new String[]{};
        List<String> listSolution = new ArrayList<String>();
        int[] currentPosition = position;
        for (String move : moves) {
            if (move.equals("up")) {
                if (position[0] != 0) {
                    currentPosition[0] = position[0] - 1;
                }
                listSolution.add(fighters[currentPosition[0]][currentPosition[1]]);
            }
            if (move.equals("down")) {
                if (position[0] != 1) {
                    currentPosition[0] = position[0] + 1;
                }
                listSolution.add(fighters[currentPosition[0]][currentPosition[1]]);
            }
            if (move.equals("left")) {
                if (position[1] == 0) {
                    currentPosition[1] = fighters[0].length - 1;
                } else {
                    currentPosition[1] = position[1] - 1;
                }
                listSolution.add(fighters[currentPosition[0]][currentPosition[1]]);
            }
            if (move.equals("right")) {
                if (position[1] == fighters[0].length - 1) {
                    currentPosition[1] = 0;
                } else {
                    currentPosition[1] = position[1] + 1;
                }
                listSolution.add(fighters[currentPosition[0]][currentPosition[1]]);
            }
            position = currentPosition;
        }
        return listSolution.toArray(solution);
    }
}
