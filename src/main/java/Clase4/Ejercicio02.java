package Clase4;
import java.util.Random;

public class Ejercicio02 {
    public static void main(String[] args) {
        final int TAMANO = 8;
        int[] numeros = new int[TAMANO];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 10) + 1;
        }

        System.out.println("Array original:");
        mostrarArray(numeros);

        ordenarArray(numeros);

        System.out.println("Array ordenado:");
        mostrarArray(numeros);
    }

    public static void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void ordenarArray(int[] listado) {
        for (int i = 0; i < listado.length - 1; i++) {
            for (int j = 0; j < listado.length - 1; j++) {
                if (listado[j] > listado[j + 1]) {
                    int aux = listado[j];
                    listado[j] = listado[j + 1];
                    listado[j + 1] = aux;
                }
            }
        }
    }

}
