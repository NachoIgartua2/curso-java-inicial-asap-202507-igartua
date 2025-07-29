package Clase3;
import RecursosReutilizables.Consola;

public class Ejercicio03 {
    public static void main(String[] args) {
        final int TAM = 5;
        int[] numeros = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            numeros[i] = Consola.leerEntero("Ingrese el número " + (i + 1) + ": ");
        }

        int i = 0;
        int j = TAM - 1;
        boolean esCapicua = true;

        while (i < j && esCapicua) {
            if (numeros[i] != numeros[j]) {
                esCapicua = false;
            }
            i++;
            j--;
        }

        if (esCapicua) {
            Consola.mostrar("El array es capicúa.");
        } else {
            Consola.mostrar("El array NO es capicúa.");
        }

        Consola.cerrar();
    }
}
