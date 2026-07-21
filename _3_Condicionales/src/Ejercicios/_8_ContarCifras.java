//Ejercicio 8: Pedir un número  entre 0 y 99 999 y decir cuántas  cifras tiene.

package Ejercicios;

import java.util.Scanner;

public class _8_ContarCifras {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();

        if (numero < 10) {
            System.out.println("Tiene 1 cifra");
        }
        else if (numero < 100) {
            System.out.println("Tiene 2 cifras");
        }
        else if (numero < 1000) {
            System.out.println("Tiene 3 cifras");
        }
        else if (numero < 10000) {
            System.out.println("Tiene 4 cifras");
        }
        else if (numero < 100000) {
            System.out.println("Tiene 5 cifras");
        }


    }
}