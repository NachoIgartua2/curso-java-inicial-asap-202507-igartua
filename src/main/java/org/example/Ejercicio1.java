package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribí un número entero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("es múltiplo de 2");
        } else if (numero % 3 == 0) {
            System.out.println("es múltiplo de 3");
        } else {
            System.out.println("no es múltiplo de 2 ni de 3");
        }
    }
}
