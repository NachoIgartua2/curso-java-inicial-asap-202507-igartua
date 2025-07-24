package Clase1;

import RecursosReutilizables.Consola;

public class Ejercicio3 {
    public static void main(String[] args) {
        double nota = Consola.leerDecimal("escribite una calificación numérica (0-10): ");

        if (nota < 0 || nota > 10) {
            Consola.mostrar("nota inválida. Debe estar entre 0 y 10.");
        } else if (nota < 5) {
            Consola.mostrar("Insuficiente");
        } else if (nota < 6) {
            Consola.mostrar("Suficiente");
        } else if (nota < 7) {
            Consola.mostrar("Bien");
        } else if (nota < 9) {
            Consola.mostrar("Notable");
        } else {
            Consola.mostrar("Sobresaliente :)");
        }
    }
}
