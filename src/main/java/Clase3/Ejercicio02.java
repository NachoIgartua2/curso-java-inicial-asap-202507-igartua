package Clase3;
import RecursosReutilizables.Consola;

public class Ejercicio02 {
    public static void main(String[] args) {
        final int CANTIDAD = 6;
        int[] numeros = new int[CANTIDAD];

        for (int i = 0; i < CANTIDAD; i++) {
            numeros[i] = Consola.leerEntero("Ingrese el número " + (i + 1) + ": ");
        }

        int max = numeros[0];
        int min = numeros[0];

        for (int i = 1; i < CANTIDAD; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        Consola.mostrar("Valor máximo: " + max);
        Consola.mostrar("Posiciones del máximo:");
        for (int i = 0; i < CANTIDAD; i++) {
            if (numeros[i] == max) {
                Consola.mostrar(" - Posición: " + i);
            }
        }

        Consola.mostrar("Valor mínimo: " + min);
        Consola.mostrar("Posiciones del mínimo:");
        for (int i = 0; i < CANTIDAD; i++) {
            if (numeros[i] == min) {
                Consola.mostrar(" - Posición: " + i);
            }
        }

        Consola.cerrar();
    }


}
