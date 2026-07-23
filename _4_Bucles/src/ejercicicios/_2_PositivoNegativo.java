//Ejercicio 2: Leer un número e  indicar si es positivo o negativo.
//        El proceso se repetirá hasta que  se introduzca un O.

package ejercicicios;
import java.util.Scanner;

public class _2_PositivoNegativo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;

        do {

            System.out.print("\nIngrese un numero: ");
            numero = entrada.nextInt();

            if (numero > 0) {
                System.out.println("Numero es positivo");
            }
            else if (numero < 0) {
                System.out.println("Numero es negativo");
            } else {
                System.out.println("Numero es 0");
            }

        } while (numero != 0);
        
    }
}