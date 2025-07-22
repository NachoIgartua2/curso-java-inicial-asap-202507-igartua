package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("dia de nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("mes de nacimiento: ");
        int mes = sc.nextInt();
        System.out.print("año de nacimiento: ");
        int anio = sc.nextInt();

        int suma = dia + mes + anio;

        int numeroSuerte = 0;
        while (suma > 0) {
            numeroSuerte += suma % 10;
            suma /= 10;
        }

        System.out.println("tu número de la suerte es: " + numeroSuerte);
    }
}
