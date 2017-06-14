package org.fundacionjala.coding.cynthia;

/**
 * Created by CynthiaTerrazas on 6/13/2017.
 */
public final class Evaporator {
    /**
     * this is the constructor.
     */
    private Evaporator() {
    }

    /**
     *
     * @param contenido del recipiente.
     * @param porcentaje de perdida.
     * @param limite de perdida.
     * @return dias.
     */
    public static int evaporator(double contenido, int porcentaje, int limite) {
        int dias = 0;
        double limit = contenido * limite / 100;
        while (contenido > limit) {
            contenido -= contenido * porcentaje / 100;
            dias++;
        }
        return dias;
    }
}

