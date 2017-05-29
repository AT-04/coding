package org.fundacionjala.coding.MarcoM_spin_word;

/**
 * Created by Administrator on 5/29/2017.
 */
public class SpinWorld {
    public static final int CONSTANT = 5;
    /**
     * verify.
     *
     * @param sentence hello world.
     * @return String
     */
    public String reverse(String sentence) {
        if (sentence.length() == 0) {
            return "";
        }
        String[] words = sentence.split(" ");
        StringBuilder aux = new StringBuilder();

        for (String word : words) {
            if (word.length() >= CONSTANT) {
                aux.append(" ");
                StringBuilder builder = new StringBuilder(word);
                aux.append(builder.reverse().toString());
            }
            aux.append(" ");
            aux.append(word);
        }
        return aux.toString().trim();
    }
}
