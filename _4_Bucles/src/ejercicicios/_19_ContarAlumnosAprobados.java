//Ejercicio 19: Dadas 6 notas, escribir la cantidad de alumnos
//        aprobados, condicionados (=4) y  suspensos.
package ejercicicios;
import java.util.Scanner;
public class _19_ContarAlumnosAprobados {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nota;
        int aprobados = 0, condicionados = 0, suspensos = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Ingrese nota del alumno " + i + ": ");
            nota = entrada.nextInt();
            if (nota > 4) {
                aprobados++;
            } else if (nota == 4) {
                condicionados++;
            } else {
                suspensos++;
            }
        }

        System.out.println("\nAprobados = " + aprobados);
        System.out.println("Condicionados = " + condicionados);
        System.out.println("Suspensos = " + suspensos);
    }
}