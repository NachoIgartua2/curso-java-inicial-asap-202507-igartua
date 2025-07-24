package Clase1;

import RecursosReutilizables.Consola;

public class Ejercicio4 {
    public static void main(String[] args) {
        int anio = Consola.leerEntero("escribite un año: ");

        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        if (bisiesto) {
            Consola.mostrar(anio + " es un año bisiesto.");
        } else {
            Consola.mostrar(anio + " no es un año bisiesto.");
        }
    }
}
