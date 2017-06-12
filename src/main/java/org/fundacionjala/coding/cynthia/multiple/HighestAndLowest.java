package Cynthia;

import java.util.StringJoiner;

/**
 * Created by CynthiaTerrazas on 6/12/2017.
 */
public class HighestAndLowest {
    public String calculated(String cadena ){
        StringBuilder cadenaN = new StringBuilder();
        String[] setNumbers = cadena.split(" ");
        int mayor=-100;
        int menor=100;
        for (String word : setNumbers){
            int numero =Integer.parseInt(word);
            if(numero >= mayor){
                mayor=numero;
            }
            if(numero<=menor){
                menor=numero;
            }
        }
        cadenaN.append(mayor);
        cadenaN.append(" ");
        cadenaN.append(menor);
        return cadenaN.toString();
    }
}
