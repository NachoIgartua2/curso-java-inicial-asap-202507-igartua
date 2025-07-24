package Clase2;
import RecursosReutilizables.Consola;

public class Ejercicio02 {
    public static void main(String[] args) {
        int num1 = Consola.leerEntero("Ingresá un numero: ");
        int num2 = Consola.leerEntero("Ingresá otro numero: ");

        int suma1 = sumarDivPropios(num1);
        int suma2 = sumarDivPropios(num2);

        if (suma1 == num2 && suma2 == num1) {
            Consola.mostrar(num1 + " y " + num2 + " son números amigos.");
        } else {
            Consola.mostrar(num1 + " y " + num2 + " NO son números amigos.");
        }
    }
    
    //metodo static , no necesita ser instanciado, por eso lo cree en la misma clase q el main
    public static int sumarDivPropios(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
