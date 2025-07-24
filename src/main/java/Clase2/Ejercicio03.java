package Clase2;
import RecursosReutilizables.Consola;

public class Ejercicio03 {
    public static void main(String[] args) {
        int numero;
        int cifra;
        int suma;
        int copia;

        do {
            numero = Consola.leerEntero("Ingresa un numero entero positivo: ");
        } while(numero <= 0);

        suma = 0;
        copia = numero;
        while (copia > 0) {
            cifra = copia % 10; //al hacer esta operacion obtengo la ultima cifra
            suma = suma + cifra;
            copia = copia / 10;
        }
        System.out.println("La suma de sus cifras es: " + suma);
    }
}
