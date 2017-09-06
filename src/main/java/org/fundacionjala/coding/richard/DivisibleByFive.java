package org.fundacionjala.coding.richard;

import java.util.regex.Pattern;

/**
 * Created by Richard on 9/5/2017.
 */
public class DivisibleByFive {

    /**
     * @return Pattern compile.
     */
    public Pattern pattern() {
        return Pattern.compile("(0|1(10)*(0|11)(01*01|01*00(10)*(0|11))*1)+");
    }
}
