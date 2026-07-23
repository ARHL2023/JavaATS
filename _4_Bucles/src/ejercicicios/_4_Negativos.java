//Ejercicio 4: Pedir números hasta  que se teclee uno negativo, y
//        mostrar cuántos números se han  introducido.
package ejercicicios;
import java.util.Scanner;

public class _4_Negativos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, i = 0;

        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();

        while (numero >= 0) {
            i++;
            System.out.print("Ingrese un numero: ");
            numero = entrada.nextInt();
        }

        System.out.println("\nSe han introuducido " + i + " numeros");

    }
}