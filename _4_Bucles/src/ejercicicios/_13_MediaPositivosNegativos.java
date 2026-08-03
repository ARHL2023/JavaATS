//Ejercicio 13: Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos
//        y la cantidad de ceros.

package ejercicicios;
import java.util.Scanner;
public class _13_MediaPositivosNegativos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int sumaPositivos = 0, sumaNegativos = 0, numeros;
        int contPos = 0, contNeg = 0, total0 = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Ingrese un numero " + i + ": ");
            numeros = entrada.nextInt();

            if (numeros > 0) {
                sumaPositivos += numeros;
                contPos++;
            } else if (numeros < 0) {
                sumaNegativos += numeros;
                contNeg++;
            } else {
                total0++;
            }
        }

        if (contPos > 0) {
            System.out.println("Media positivos = " + (double) sumaPositivos / contPos);
        }

        if (contNeg > 0) {
            System.out.println("Media negativos = " + (double) sumaNegativos / contNeg);
        }

        System.out.println("Cantidad de ceros = " + total0);

    }
}