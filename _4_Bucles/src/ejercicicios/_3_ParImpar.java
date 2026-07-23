// Ejercicio 3: Leer números hasta  que se introduzca un 0.
//         Para  cada uno indicar si es par o  impar.

package ejercicicios;
import java.util.Scanner;

public class _3_ParImpar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;

        do {
            System.out.print("\nIngrese un numero: ");
            numero = entrada.nextInt();

            if (numero == 0) {
                System.out.println("Hasta pronto");
            } else if (numero % 2 == 0) {
                System.out.println("Numero es par");
            } else if (numero % 2 != 0) {
                System.out.println("Numero es impar");
            }

        }  while (numero != 0);

    }
}