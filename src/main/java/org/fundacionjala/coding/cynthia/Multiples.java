package org.fundacionjala.coding.cynthia;

/**
 * Created by CynthiaTerrazas on 6/14/2017.
 */
public final class Multiples {
    /**
     * this is the constructor.
     */
    private Multiples() {
    }

    /**
     * @param limite numero limite.
     * @return suma de los multiplos.
     */
    public static int solution(int limite) {
        int suma = 0;
        for (int i = 1; i < limite; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
