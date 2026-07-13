//Ejercicio 1: Hacer un programa que lea un
//        número entero y muestre si el número es
//        múltiplo de 10.

package Ejercicios;

import java.util.Scanner;

public class _1_Multiplo10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();

        if (numero % 10 ==0) {
            System.out.println("Es multiplo de 10");
        }
        else {
            System.out.println("No es multiplo de 10");
        }

    }
}