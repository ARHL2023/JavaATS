//Ejercicio 22:
//        Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
package ejercicicios;

import java.util.Scanner;

public class _22_Suspenso {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nota;
        boolean suspenso = false;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Ingrese calificacion del alumno " + i + ": ");
            nota = entrada.nextInt();

            if (nota < 5) {
                suspenso = true;
            }
        }

        if (suspenso) {
            System.out.println("Hay al menos un alumno suspenso");
        }
        else {
            System.out.println("No hay ningun alumno suspenso");
        }
    }
}
