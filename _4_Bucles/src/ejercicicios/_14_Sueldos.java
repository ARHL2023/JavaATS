//Ejercicio 14: Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1000.
package ejercicicios;

import java.util.Scanner;

public class _14_Sueldos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double sueldos = 0, totalSueldos = 0;
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese sueldo " + i + " : ");
            sueldos = entrada.nextDouble();
            totalSueldos += sueldos;
            if (sueldos > 1000) {
                contador++;
            }
        }

        System.out.println("totalSueldos = " + totalSueldos);
        System.out.println("contador = " + contador);

    }
}