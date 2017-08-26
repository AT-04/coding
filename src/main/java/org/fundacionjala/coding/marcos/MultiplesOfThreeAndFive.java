package org.fundacionjala.coding.marcos;

/**
 * Created by Marcos on 12-06-2017.
 */
public final class MultiplesOfThreeAndFive {

    /**
     * Private constructor required. These kind of classes are more like tools/utilities than being meant for objects.
     */
    private MultiplesOfThreeAndFive() {

    }

    /**
     * Main method that calculates the solution of the sum of the multiples of three and five.
     *
     * @param number Is the parameter number from which the solution is to be calculated.
     * @return The sum of the multiples of three and five.
     */
    public static int solution(int number) {
        int sum = 0;
        for (int i = 3; i < number; i++) {
            sum += (i % 3 == 0 || i % 5 == 0) ? i : 0;
        }
        return sum;
    }
}
