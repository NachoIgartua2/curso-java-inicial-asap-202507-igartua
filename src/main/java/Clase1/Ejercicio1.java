package Clase1;

import RecursosReutilizables.Consola;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero = Consola.leerEntero("Escribí un número entero: ");

        if (numero % 2 == 0) {
            Consola.mostrar("es múltiplo de 2");
        } else if (numero % 3 == 0) {
            Consola.mostrar("es múltiplo de 3");
        } else {
            Consola.mostrar("no es múltiplo de 2 ni de 3");
        }
    }
}
