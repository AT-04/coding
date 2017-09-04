package org.fundacionjala.coding.richard;

/**
 * Created by Richard on 8/20/2017.
 * <p>
 * Do you know how to write a recursive function? Let's test it!
 * Definition: Recursive function is a function that calls itself during its execution
 * Your objective is to complete a recursive function reverse() that receives str as
 * String and returns the same string in reverse order
 */
public class Reverse {

    /**
     * This method return a reverse string.
     *
     * @param cad this variable contains a string.
     * @return reverse string.
     */
    public String reverse(String cad) {
        if ((null == cad) || (cad.length() <= 1)) {
            return cad;
        }
        return String.format("%s%s", reverse(cad.substring(1)), cad.charAt(0));
    }
}
