// Ejercicio 12: Pedir un número y  calcular su factorial.
package ejercicicios;
import java.util.Scanner;
public class _12_FactorialNumero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int factorial=1;

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        for (int i = numero; i >=1; i--) {
            factorial *=i;
            System.out.println("i = " + i);
        }

        System.out.println("factorial = " + factorial);

    }
}