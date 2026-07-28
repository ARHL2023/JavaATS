//Ejercicio 5: Realizar un juego para adivinar un  número.
//        Para ello generar un número aleatorio  entre 0-100, y luego ir pidiendo números
//        indicando "es mayor" o "es menor" según sea  mayor o menor con respecto a N.
//        El proceso  termina cuando el usuario acierta y mostrar el  número de intentos.

package ejercicicios;
import java.util.Scanner;
public class _5_AdivinarNumeroAleatorio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, contador = 0;
        int numeroAleatorio = (int) (Math.random() * 101);

        do {
            System.out.print("\nIngrese un numero: ");
            numero = entrada.nextInt();
            if (numeroAleatorio > numero) {
                System.out.println("El numero es mayor");
            }
            else if (numeroAleatorio < numero) {
                System.out.println("El numero es menor");
            }
            contador++;
        } while (numero != numeroAleatorio);

        System.out.println("\nNumero de intentos: " + contador);

    }
}