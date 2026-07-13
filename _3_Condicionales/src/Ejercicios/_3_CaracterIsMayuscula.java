//Ejercicio 3: Hacer un programa
//        que lea un carácter por teclado y
//        compruebe si es una letra
//        mayúscula.

package Ejercicios;

import java.util.Scanner;

public class _3_CaracterIsMayuscula {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Character caracter;

        System.out.println("Ingrese una letra: ");
        caracter = entrada.next().charAt(0);

        if (Character.isUpperCase(caracter)) {
            System.out.println("Es una letra mayuscula");
        }
        else if (Character.isLowerCase(caracter)) {
            System.out.println("Es una letra minuscula");
        }
        else {
            System.out.println("No es una letra");
        }

    }
}