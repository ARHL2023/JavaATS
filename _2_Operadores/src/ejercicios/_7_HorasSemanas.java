//Ejercicio 7:
//        Construir un programa que, dado un número total de horas,
//        devuelve el número de semanas, días y horas equivalentes.
//        Por ejemplo, dado un total de 1000 horas
//        debe mostrar 5 semanas, 6 días y 16 horas.

package ejercicios;

import java.util.Scanner;

public class _7_HorasSemanas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int totalHoras;
        int semanas, dias, horas;

        System.out.println("Ingrese total de horas");
        totalHoras = entrada.nextInt();

        semanas = totalHoras / 168;
        dias = totalHoras % 168 / 24;
        horas = totalHoras % 24;

        System.out.println("\nsemanas = " + semanas);
        System.out.println("dias = " + dias);
        System.out.println("horas = " + horas);

    }
}