//Ejercicio 1: Leer un número y  mostrar su cuadrado, repetir el
//        proceso hasta que se introduzca  un número negativo.
package ejercicicios;
import java.util.Scanner;

public class _1_NumeroCuadrado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero,cuadrado;

        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();

        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero,2);
            System.out.println("cuadrado = " + cuadrado);
            System.out.println("Ingrese un numero: ");
            numero = entrada.nextInt();
        }

    }
}