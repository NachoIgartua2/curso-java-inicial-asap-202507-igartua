package Clase4;

import RecursosReutilizables.Consola;

public class Ejercicio01 {
    
    public static void main(String[] args) {
        int numero = Consola.leerEntero("Ingrese un número: ");
        
        if (esPrimo(numero)) {
            Consola.mostrar(numero + " es un número primo.");
        } else {
            Consola.mostrar(numero + " no es un número primo.");
        }
        
        Consola.cerrar();
    }

    public static boolean esPrimo(int numero) {
        boolean resultado = true;
        
        if (numero <= 1) {
            resultado = false;
        } else if (numero == 2) {
            resultado = true;
        } else if (numero % 2 == 0) {
            resultado = false;
        } else {
            resultado = tieneDivisorImpar(numero);
        }
        
        return resultado;
    }

    public static boolean tieneDivisorImpar(int numero) {
        boolean tieneDivisor = false;
        int i = 3;

        while (i * i <= numero && !tieneDivisor) {
            if (numero % i == 0) {
                tieneDivisor = true;
            } else {
                i += 2;
            }
        }

        return !tieneDivisor;
    }

}
