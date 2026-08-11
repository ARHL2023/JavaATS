//Ejercicio 21: Pedir 10 números, y  mostrar al final si se ha introducido alguno negativo.
package ejercicicios;

import java.util.Scanner;

public class _21_NumerosNegativos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        boolean negativo = false;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Ingrese numero " + i + ": ");
            numero = entrada.nextInt();

            if (numero < 0) {
                negativo = true;
            }
        }

        if (negativo) {
            System.out.println("Se ha introducido al menos un numero negativo");
        }
        else {
            System.out.println("No se ha introducido ningun numero negativo");
        }
    }
}
