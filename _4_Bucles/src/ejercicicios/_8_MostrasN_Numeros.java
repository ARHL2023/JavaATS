//Ejercicio 8: Pedir un número N, y  mostrar todos los números del 1 al N.
package ejercicicios;

import java.util.Scanner;

public class _8_MostrasN_Numeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        for (int i =1; i<=numero; i++){
            System.out.println("i = " + i);
        }

    }
}