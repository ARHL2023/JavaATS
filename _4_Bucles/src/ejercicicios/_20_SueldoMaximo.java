//Ejercicio 20: Pedir un número N, introducir N sueldos, y mostrar el  sueldo máximo.
package ejercicicios;

import java.util.Scanner;
public class _20_SueldoMaximo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese cantidad de sueldos: ");
        int n = entrada.nextInt();

        double sueldo, sueldoMaximo = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("Ingrese sueldo " + i + ": ");
            sueldo = entrada.nextDouble();

            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
        }

        System.out.println("Sueldo maximo = " + sueldoMaximo);
    }
}