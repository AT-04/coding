package org.fundacionjala.coding.abel;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Once upon a time, on a way through the old wild west,…
 * … a man was given directions to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST".
 * Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too. Going to one direction and coming back the opposite
 * direction is a needless effort. Since this is the wild west, with dreadfull weather and not much water, it's
 * important to save yourself some energy, otherwise you might die of thirst!
 * How I crossed the desert the smart way.
 * Write a function dirReduc which will take an array of strings and returns an array of strings with the needless
 * directions removed (W<->E or S<->N side by side).
 * The Haskell version takes a list of directions with data Direction = North | East | West | South. The Clojure
 * version returns nil when the path is reduced to nothing.
 * The Rust version takes a slice of enum Direction {NORTH, SOUTH, EAST, WEST}.
 * Examples
 * dirReduc(["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"]) => ["WEST"]
 * dirReduc(["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"]) => []
 * Note
 * Not all paths can be made simpler. The path ["NORTH", "WEST", "SOUTH", "EAST"] is not reducible.
 * "NORTH" and "WEST", "WEST" and "SOUTH", "SOUTH" and "EAST" are not directly opposite of each other and can't become
 * such. Hence the result path is itself : ["NORTH", "WEST", "SOUTH", "EAST"].
 */
public class DirReduction {

    /**
     * Private constructor.
     */
    private DirReduction() {

    }

    /**
     * Reduce the directions.
     *
     * @param arr Array with directions.
     * @return Array with only neccesary directions.
     */
    public static String[] dirReduc(String[] arr) {
        List<String> actuaList = new LinkedList<>(Arrays.asList(arr));
        int i = 0;
        while (i < actuaList.size() - 1) {
            if (("NORTH".equals(actuaList.get(i)) && "SOUTH".equals(actuaList.get(i + 1)))
                    || ("SOUTH".equals(actuaList.get(i)) && "NORTH".equals(actuaList.get(i + 1)))
                    || ("EAST".equals(actuaList.get(i)) && "WEST".equals(actuaList.get(i + 1)))
                    || ("WEST".equals(actuaList.get(i)) && "EAST".equals(actuaList.get(i + 1)))) {
                actuaList.remove(i + 1);
                actuaList.remove(i);
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        return actuaList.toArray(new String[actuaList.size()]);
    }
}
