//Ejercicio 1: Hacer un programa que calcule
//e imprima la suma de tres calificaciones.

package ejercicios;

import java.util.Scanner;

public class _1_Suma {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3;
        double suma;

        System.out.println("Ingrese primera nota:");
        nota1 = entrada.nextDouble();

        System.out.println("Ingrese segunda nota:");
        nota2 = entrada.nextDouble();

        System.out.println("Ingrese tercera nota:");
        nota3 = entrada.nextDouble();

        suma = nota1 + nota2 + nota2;

        System.out.println("\nsuma = " + suma);

    }
}