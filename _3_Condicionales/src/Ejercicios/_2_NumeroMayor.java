//Ejercicio 2: Pedir dos números y
//        decir cual es el mayor o si son
//        iguales.
package Ejercicios;

import java.util.Scanner;

public class _2_NumeroMayor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1, n2;

        System.out.println("Ingrese primer numero: ");
        n1 = entrada.nextInt();
        System.out.println("Ingrese segundo numero: ");
        n2 = entrada.nextInt();

        if (n1 > n2) {
            System.out.println("El mayor es " + n1);
        } else if (n2 > n1) {
            System.out.println("El mayor es: " + n2);
        } else {
            System.out.println("Son iguales");
        }

    }
}