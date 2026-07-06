/*
Ejercicio 3: Guillermo tiene N dólares.
Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
*/

package ejercicios;

import java.util.Scanner;

public class _3_CantidadDinero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int guillermo, luis, juan;
        int suma;

        System.out.println("Ingrese cantidad de dinero que tiene Guillermo: ");
        guillermo = entrada.nextInt();

        luis = guillermo / 2;
        juan = (luis + guillermo) / 2;
        suma = guillermo + juan + luis;

        System.out.println("\nguillermo = " + guillermo);
        System.out.println("luis = " + luis);
        System.out.println("juan = " + juan);

        System.out.println("\nsuma = " + suma);

    }
}