package Clase1;

import RecursosReutilizables.Consola;

public class Ejercicio2 {
    public static void main(String[] args) {
        int dia = Consola.leerEntero("dia de nacimiento: ");
        int mes = Consola.leerEntero("mes de nacimiento: ");
        int anio = Consola.leerEntero("año de nacimiento: ");

        int suma = dia + mes + anio;

        int numeroSuerte = 0;
        while (suma > 0) {
            numeroSuerte += suma % 10;
            suma /= 10;
        }

        Consola.mostrar("tu número de la suerte es: " + numeroSuerte + "ojo con jugarlo en la quiniela... no seas ludopata");
    }
}
