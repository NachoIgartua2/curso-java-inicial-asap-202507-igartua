package Clase2;

import RecursosReutilizables.Consola;

public class Ejercicio01 {
    public static void main(String[] args) {
        int num;
        do {
            num = Consola.leerEntero("Ingresá un número positivo: ");
        } while (num <= 0);
        int a = 1;
        int b = 1;

        for (int i = 1; i <= num; i++) {
            System.out.println(a + " ");
            int sig = a + b;
            a = b;
            b = sig;
        }
    }
}
