//Ejercicio 5:
//        La calificación final de un estudiante de Informática se calcula con base a las calificaciones de
//        cuatro aspectos de su rendimiento académico:
//        participación, primer examen parcial, segundo examen parcial y examen final.
//        Sabiendo que las calificaciones anteriores entran a la calificación final
//        con ponderaciones del 10%, 25%, 25% y 40%,
//        Hacer un programa que calcule  e imprima la calificación final obtenida por un estudiante.

package ejercicios;

import java.util.Scanner;

public class _5_Calificaciones {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double participacion, examen1, examen2, examen3;
        double calfificacionFinal;

        System.out.println("Ingrese nota de participacion: ");
        participacion = entrada.nextDouble();

        System.out.println("Ingrese nota de primer examen parcial: ");
        examen1 = entrada.nextDouble();

        System.out.println("Ingrese nota de segundo examen parcial: ");
        examen2 = entrada.nextDouble();

        System.out.println("Ingrese nota del examen final: ");
        examen3 = entrada.nextDouble();

        participacion *= 0.10;
        examen1 *= 0.25;
        examen2 *= 0.25;
        examen3 *= 0.40;

        calfificacionFinal = participacion+examen1+examen2+examen3;

        System.out.println("\ncalfificacionFinal = " + calfificacionFinal);

    }
}