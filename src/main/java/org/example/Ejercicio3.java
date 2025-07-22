package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("escribite una calificación numérica (0-10): ");
        double nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("nota inválida. Debe estar entre 0 y 10.");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente :)");
        }
    }
}
