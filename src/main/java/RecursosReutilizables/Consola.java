package RecursosReutilizables;

import java.util.Scanner;

/**
 * Clase utilitaria para leer datos desde la consola
 * Todos los métodos son estáticos para facilitar su uso
 */
public class Consola {
    private static Scanner scanner = new Scanner(System.in);
    
    /**
     * Lee un número entero desde la consola
     * @param mensaje Mensaje a mostrar al usuario
     * @return El número entero ingresado
     */
    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }
    
    /**
     * Lee un número entero sin mensaje
     * @return El número entero ingresado
     */
    public static int leerEntero() {
        return scanner.nextInt();
    }
    
    /**
     * Lee un número decimal (double) desde la consola
     * @param mensaje Mensaje a mostrar al usuario
     * @return El número decimal ingresado
     */
    public static double leerDecimal(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }
    
    /**
     * Lee un número decimal sin mensaje
     * @return El número decimal ingresado
     */
    public static double leerDecimal() {
        return scanner.nextDouble();
    }
    
    /**
     * Lee una cadena de texto (una palabra) desde la consola
     * @param mensaje Mensaje a mostrar al usuario
     * @return La palabra ingresada
     */
    public static String leerPalabra(String mensaje) {
        System.out.print(mensaje);
        return scanner.next();
    }
    
    /**
     * Lee una línea completa de texto desde la consola
     * @param mensaje Mensaje a mostrar al usuario
     * @return La línea completa ingresada
     */
    public static String leerLinea(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
    
    /**
     * Lee un valor booleano desde la consola
     * @param mensaje Mensaje a mostrar al usuario
     * @return El valor booleano ingresado
     */
    public static boolean leerBooleano(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextBoolean();
    }
    
    /**
     * Muestra un mensaje en la consola
     * @param mensaje Mensaje a mostrar
     */
    public static void mostrar(String mensaje) {
        System.out.println(mensaje);
    }
    
    /**
     * Cierra el Scanner (usar solo al final del programa)
     */
    public static void cerrar() {
        scanner.close();
    }
}
