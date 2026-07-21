//Ejercicio 11: Construir un programa que simule el  funcionamiento de una calculadora que puede realizar las
//        cuatro operaciones aritméticas básicas (suma, resta, producto  y división) con valores numéricos enteros.
//        El usuario debe  especificar la operación con el primer carácter del primer  parámetro de la línea de comandos:
//        S o s para la suma, R o r  para la resta, P, p, M o m para el producto y D o d para la  división.

package Ejercicios;

import java.util.Scanner;

public class _11_Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero1 = 0, numero2 = 0;
        char dato;

        System.out.println("Ingrese primer valor: ");
        numero1 = entrada.nextDouble();
        System.out.println("Ingrese segundo valor: ");
        numero2 = entrada.nextDouble();

        System.out.println("S-s Suma\nR- resta \nP-p producto \nD-d division");
        System.out.print("Elija una opcion: ");

        dato = entrada.next().charAt(0);

        switch (dato) {
            case 'S', 's':
                System.out.println("\nSuma");
                double suma = numero1 + numero2;
                System.out.println("suma = " + suma);
                break;
            case 'R', 'r':
                System.out.println("\nresta");
                double resta = numero1 - numero2;
                System.out.println("resta = " + resta);
                break;
            case 'P', 'p':
                System.out.println("\nproducto");
                double producto = numero1 * numero2;
                System.out.println("producto = " + producto);
                break;
            case 'D', 'd':
                System.out.println("\ndivision");
                double division = numero1 / numero2;
                System.out.println("division = " + division);
                break;

            default:
                System.out.println("Opcion incorrecta");
        }

    }
}