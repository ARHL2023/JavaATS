//Ejercicio 10: Pedir 10 numeros y escribir la suma total.
package ejercicicios;

import java.util.Scanner;

public class _10_SumaNumerosN {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeros, suma=0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese numero " + i+": ");
             numeros = entrada.nextInt();
            suma+=numeros;
        }

        System.out.println("suma = " + suma);

    }
}