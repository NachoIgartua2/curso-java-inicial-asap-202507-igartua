package Clase3; // Cambia esto según tu estructura

import RecursosReutilizables.Consola;

public class Ejercicio01 {
    public static void main(String[] args) {
        int num;

        do {
            num = Consola.leerEntero("Ingrese la cantidad de personas (entero positivo): ");
        } while (num <= 0);

        double[] alturas = new double[num];
        double sumaAlturas = 0;

        for (int i = 0; i < num; i++) {
            alturas[i] = Consola.leerDecimal("Ingrese la altura de la persona " + (i + 1) + " (en metros, por ejemplo 1,70): ");
            sumaAlturas += alturas[i];
        }

        double promedio = sumaAlturas / num;
        int mayores = 0;
        int menores = 0;

        for (int i = 0; i < num; i++) {
            if (alturas[i] > promedio) {
                mayores++;
            } else if (alturas[i] < promedio) {
                menores++;
            }
        }

        Consola.mostrar("Altura promedio: " + promedio + " metros");
        Consola.mostrar("Cantidad de personas con altura superior al promedio: " + mayores);
        Consola.mostrar("Cantidad de personas con altura inferior al promedio: " + menores);

        Consola.cerrar();
    }
}
