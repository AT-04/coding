package org.fundacionjala.coding.abel;

/**
 * CYou live in the city of Cartesia where all roads are laid out in a perfect grid.
 * You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk.
 * The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button
 * it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']).
 * You know it takes you one minute to traverse one city block, so create a function that will return true if
 * the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will,
 * of course, return you to your starting point. Return false otherwise.
 */
public final class TenMinWalk {

    /**
     * Private Constructor.
     */
    private TenMinWalk() {

    }

    /**
     * Returns if the Walk is valid.
     *
     * @param walk char[].
     * @return boolean.
     */
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int y = 0;
        int x = 0;
        for (char move : walk) {
            switch (move) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'w':
                    x++;
                    break;
                case 'e':
                    x--;
                    break;
                default:
                    break;
            }
        }
        return y == 0 && x == 0;
    }
}
