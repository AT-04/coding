package org.fundacionjala.coding.MarcoM_spin_word;
/**
 * Created by Administrator on 5/26/2017.
 */
public class EAN {

    public static final int CONSTANT_X = 12;
    public static final int CONSTANT = 10;
    public static final int CONSTANT_MOD = 2;
    public static final int OTHER_CONSTANT = 3;
    /**
     * verify.
     *
     * @param code is verify string.
     * @return boolean
     */
    public boolean validate(String code) {
        int sum = 0;
        for (int i = 1; i <= CONSTANT_X; i++) {
            if (i % CONSTANT_MOD == 0) {
                sum = sum + (Integer.parseInt(code.substring(i - 1, i)) * OTHER_CONSTANT);
                continue;
            }
            sum += (Integer.parseInt(code.substring(i - 1, i)) * 1);
        }
        int aux = Integer.parseInt(code.substring(code.length() - 1, code.length()));
        return ((CONSTANT - (sum % CONSTANT)) == aux);
    }
}
