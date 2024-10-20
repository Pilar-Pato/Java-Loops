package org.factoriaf5.javaloops;

public class Loops {
    public static String[] Tabla(int numero) {
        String[] tabla = new String[10];
        for (int i = 1; i <= 10; i++) {
            tabla[i - 1] = numero + " x " + i + " = " + (numero * i);
        }
        return tabla;
    }

}
