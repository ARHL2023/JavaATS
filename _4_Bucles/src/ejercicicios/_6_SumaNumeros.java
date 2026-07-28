//Ejercicio 6: Pedir números hasta  que se teclee un 0, mostrar la
//        suma de todos los números  introducidos.

package ejercicicios;

import java.util.Scanner;

public class _6_SumaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, suma=0;

        do {
            System.out.print("Ingrese un numero: ");
            numero = entrada.nextInt();
            suma +=numero;
        }while (numero!=0);

        System.out.println("suma = " + suma);

    }
}
